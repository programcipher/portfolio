document.addEventListener('DOMContentLoaded', function () {
    initNavbar();
    initHamburger();
    initSmoothScroll();
    initScrollReveal();
    initSkillBars();
    initProjectFilters();
    initGalleryLightbox();
});

function initNavbar() {
    var navbar = document.getElementById('navbar');
    var scrollThreshold = 50;

    function handleScroll() {
        if (window.scrollY > scrollThreshold) {
            navbar.classList.add('scrolled');
        } else {
            navbar.classList.remove('scrolled');
        }
    }

    window.addEventListener('scroll', handleScroll, { passive: true });
    handleScroll();
}

function initHamburger() {
    var hamburger = document.getElementById('hamburger');
    var navMenu = document.getElementById('navMenu');

    hamburger.addEventListener('click', function () {
        hamburger.classList.toggle('active');
        navMenu.classList.toggle('active');
    });

    var navLinks = document.querySelectorAll('.nav-link');
    navLinks.forEach(function (link) {
        link.addEventListener('click', function () {
            hamburger.classList.remove('active');
            navMenu.classList.remove('active');
        });
    });
}

function initSmoothScroll() {
    var links = document.querySelectorAll('a[href^="#"]');
    links.forEach(function (link) {
        link.addEventListener('click', function (e) {
            var targetId = this.getAttribute('href');
            if (targetId === '#') return;

            var target = document.querySelector(targetId);
            if (target) {
                e.preventDefault();
                var navHeight = document.getElementById('navbar').offsetHeight;
                var targetPosition = target.getBoundingClientRect().top + window.scrollY - navHeight;

                window.scrollTo({
                    top: targetPosition,
                    behavior: 'smooth'
                });
            }
        });
    });
}

function initScrollReveal() {
    var reveals = document.querySelectorAll('.reveal');

    var observer = new IntersectionObserver(function (entries) {
        entries.forEach(function (entry) {
            if (entry.isIntersecting) {
                entry.target.classList.add('active');
            }
        });
    }, {
        threshold: 0.1,
        rootMargin: '0px 0px -50px 0px'
    });

    reveals.forEach(function (el) {
        observer.observe(el);
    });
}

function initSkillBars() {
    var skillBars = document.querySelectorAll('.skill-progress');

    var observer = new IntersectionObserver(function (entries) {
        entries.forEach(function (entry) {
            if (entry.isIntersecting) {
                var progress = entry.target.getAttribute('data-progress');
                entry.target.style.width = progress + '%';
                entry.target.classList.add('animate');
            }
        });
    }, {
        threshold: 0.3
    });

    skillBars.forEach(function (bar) {
        observer.observe(bar);
    });
}

function initProjectFilters() {
    var filterButtons = document.querySelectorAll('.filter-btn');
    var projectCards = document.querySelectorAll('.project-card');

    filterButtons.forEach(function (btn) {
        btn.addEventListener('click', function () {
            filterButtons.forEach(function (b) { b.classList.remove('active'); });
            this.classList.add('active');

            var filter = this.getAttribute('data-filter');

            projectCards.forEach(function (card) {
                var category = card.getAttribute('data-category');

                if (filter === 'all' || category === filter) {
                    card.classList.remove('hidden', 'filter-hide');
                    card.classList.add('filter-show');
                } else {
                    card.classList.add('hidden', 'filter-hide');
                    card.classList.remove('filter-show');
                }
            });
        });
    });
}

function initGalleryLightbox() {
    var lightbox = document.getElementById('galleryLightbox');
    var lightboxImg = document.getElementById('lightboxImg');
    var lightboxClose = document.getElementById('lightboxClose');
    var triggers = document.querySelectorAll('.gallery-trigger');

    if (!lightbox || !lightboxImg || !lightboxClose) return;

    function openLightbox(src) {
        lightboxImg.src = src;
        lightbox.classList.add('active');
        document.body.style.overflow = 'hidden'; // Prevents background scrolling
    }

    function closeLightbox() {
        lightbox.classList.remove('active');
        document.body.style.overflow = '';
        setTimeout(function() {
            lightboxImg.src = ''; // Clear source after transition
        }, 300);
    }

    triggers.forEach(function (trigger) {
        trigger.addEventListener('click', function () {
            var img = this.querySelector('img');
            if (img && img.src) {
                openLightbox(img.src);
            }
        });
    });

    lightboxClose.addEventListener('click', closeLightbox);

    lightbox.addEventListener('click', function (e) {
        if (e.target === lightbox) {
            closeLightbox();
        }
    });

    document.addEventListener('keydown', function (e) {
        if (e.key === 'Escape' && lightbox.classList.contains('active')) {
            closeLightbox();
        }
    });
}
