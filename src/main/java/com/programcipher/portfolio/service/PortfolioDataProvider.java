package com.programcipher.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.programcipher.portfolio.config.PortfolioConstants;
import com.programcipher.portfolio.model.Achievement;
import com.programcipher.portfolio.model.Experience;
import com.programcipher.portfolio.model.Project;
import com.programcipher.portfolio.model.Skill;

@Service
public class PortfolioDataProvider {

        public List<Project> getFeaturedProjects() {
                return getAllProjects().stream().filter(Project::featured).toList();
        }

        public List<Project> getAllProjects() {
                return List.of(
                                new Project(
                                                "Makhis Mnandi",
                                                "End-to-end food ordering platform built on a microservices architecture with dedicated services for authentication, orders, payments, delivery tracking, notifications, and vendor menus.",
                                                List.of("Node.js", "Express", "Docker", "Microservices", "REST API"),
                                                PortfolioConstants.OWNER_GITHUB + "/makhis_mnandi_backend",
                                                "",
                                                "/images/project-makhis.webp",
                                                PortfolioConstants.CATEGORY_BACKEND,
                                                true),
                                new Project(
                                                "Event Handler Platform",
                                                "Cross-platform event management ecosystem spanning a React Native mobile app, an interactive web dashboard, a Node.js backend, and a webhook services layer.",
                                                List.of("React Native", "Expo", "Node.js", "TypeScript", "REST API"),
                                                PortfolioConstants.OWNER_GITHUB + "/event-handler-app",
                                                "",
                                                "/images/project-event.webp",
                                                PortfolioConstants.CATEGORY_FULLSTACK,
                                                true),
                                new Project(
                                                "Student Care System",
                                                "Engineered a modular, role-based platform supporting 4 distinct user dashboards with permission isolated data access.",
                                                List.of("Django REST Framework", "React.js", "PostgreSQL", "JWT"),
                                                PortfolioConstants.OWNER_GITHUB + "/student-care-system",
                                                "",
                                                "/images/project-student-care.webp",
                                                PortfolioConstants.CATEGORY_FULLSTACK,
                                                true),
                                new Project(
                                                "Smart Borehole Monitoring",
                                                "IoT-enabled borehole monitoring system providing real-time sensor data visualisation, alerts, and historical analytics through a modern web dashboard.",
                                                List.of("Vite", "Prisma", "Node.js", "IoT", "Chart.js"),
                                                PortfolioConstants.OWNER_GITHUB + "/smart-borehole-sys",
                                                "",
                                                "/images/project-borehole.webp",
                                                PortfolioConstants.CATEGORY_IOT,
                                                true),
                                new Project(
                                                "MyWIL Platform",
                                                "Work-integrated learning management portal for students and supervisors, featuring role-based access, document uploads, and progress tracking.",
                                                List.of("Next.js", "Prisma", "Tailwind CSS", "TypeScript"),
                                                PortfolioConstants.OWNER_GITHUB + "/my-wil-platform",
                                                "",
                                                "/images/project-wil.webp",
                                                PortfolioConstants.CATEGORY_FULLSTACK,
                                                true),
                                new Project(
                                                "AI Recipe Generator",
                                                "AI-powered recipe planner that generates personalised meal plans and recipes based on dietary preferences, available ingredients, and nutritional goals.",
                                                List.of("Node.js", "AI/ML", "REST API", "React"),
                                                PortfolioConstants.OWNER_GITHUB + "/recipe-gen-ai-planner",
                                                "",
                                                "/images/project-recipe.webp",
                                                PortfolioConstants.CATEGORY_AI,
                                                true),
                                new Project(
                                                "Resume Tailor",
                                                "Desktop application that uses AI to generate tailored resumes and ATS-friendly cover letters for specific job applications, with PDF export.",
                                                List.of("Python", "CustomTkinter", "AI/ML", "PDF Generation"),
                                                PortfolioConstants.OWNER_GITHUB + "/resume-tailor",
                                                "",
                                                "/images/project-resume.webp",
                                                PortfolioConstants.CATEGORY_AI,
                                                false),
                                new Project(
                                                "ATM GUI Simulator",
                                                "Java Swing-based ATM simulation with account management, transaction processing, and a realistic graphical user interface.",
                                                List.of("Java", "Swing", "OOP"),
                                                PortfolioConstants.OWNER_GITHUB + "/ATMGUI",
                                                "",
                                                "/images/project-atm.webp",
                                                PortfolioConstants.CATEGORY_FULLSTACK,
                                                false),
                                new Project(
                                                "AI Subtitle Translator",
                                                "Automated subtitle translation tool leveraging AI models to translate subtitle files between languages while preserving timing and formatting.",
                                                List.of("AI/ML", "NLP", "Python"),
                                                PortfolioConstants.OWNER_GITHUB + "/ai-subtitle-translator",
                                                "",
                                                "/images/project-subtitle.webp",
                                                PortfolioConstants.CATEGORY_AI,
                                                false),
                                new Project(
                                                "Imperium Home Solutions",
                                                "Professional business website for a home improvement company featuring service catalogues, quote requests, and a modern responsive design.",
                                                List.of("HTML", "CSS", "JavaScript", "Responsive Design"),
                                                PortfolioConstants.OWNER_GITHUB + "/imperium-home-solutions",
                                                "",
                                                "/images/project-imperium.webp",
                                                PortfolioConstants.CATEGORY_FULLSTACK,
                                                false));
        }

        public List<Skill> getAllSkills() {
                return List.of(
                                new Skill("Java", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 85, "fab fa-java"),
                                new Skill("JavaScript", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 90,
                                                "fab fa-js-square"),
                                new Skill("TypeScript", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 70,
                                                "fab fa-js-square"),
                                new Skill("Python", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 65, "fab fa-python"),
                                new Skill("Kotlin", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 70, "fab fa-android"),
                                new Skill("C++", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 60, "fas fa-code"),
                                new Skill("SQL", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 89, "fas fa-database"),
                                new Skill("HTML / CSS", PortfolioConstants.SKILL_CATEGORY_LANGUAGES, 92,
                                                "fab fa-html5"),

                                new Skill("Spring Boot", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 68,
                                                "fas fa-leaf"),
                                new Skill("Django REST", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 75,
                                                "fab fa-python"),
                                new Skill("React / React Native", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 85,
                                                "fab fa-react"),
                                new Skill("Next.js", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 55, "fas fa-server"),
                                new Skill("Node.js / Express", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 90,
                                                "fab fa-node-js"),
                                new Skill("Tailwind CSS", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 88,
                                                "fas fa-palette"),
                                new Skill("Thymeleaf", PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS, 75, "fas fa-leaf"),

                                new Skill("Docker", PortfolioConstants.SKILL_CATEGORY_TOOLS, 65, "fab fa-docker"),
                                new Skill("Git / GitHub", PortfolioConstants.SKILL_CATEGORY_TOOLS, 92,
                                                "fab fa-git-alt"),
                                new Skill("GitHub Actions", PortfolioConstants.SKILL_CATEGORY_TOOLS, 78, "fas fa-cogs"),
                                new Skill("Nginx", PortfolioConstants.SKILL_CATEGORY_TOOLS, 60, "fas fa-server"),
                                new Skill("AWS Cloud", PortfolioConstants.SKILL_CATEGORY_TOOLS, 55, "fab fa-aws"),
                                new Skill("REST API Design", PortfolioConstants.SKILL_CATEGORY_TOOLS, 90,
                                                "fas fa-plug"),
                                new Skill("Linux", PortfolioConstants.SKILL_CATEGORY_TOOLS, 75, "fab fa-linux"),
                                new Skill("Figma", PortfolioConstants.SKILL_CATEGORY_TOOLS, 70, "fab fa-figma"),

                                new Skill("PostgreSQL", PortfolioConstants.SKILL_CATEGORY_DATABASES, 85,
                                                "fas fa-database"),
                                new Skill("MySQL", PortfolioConstants.SKILL_CATEGORY_DATABASES, 82, "fas fa-database"),
                                new Skill("MongoDB", PortfolioConstants.SKILL_CATEGORY_DATABASES, 47,
                                                "fas fa-database"),
                                new Skill("Prisma ORM", PortfolioConstants.SKILL_CATEGORY_DATABASES, 85,
                                                "fas fa-project-diagram"),
                                new Skill("Redis", PortfolioConstants.SKILL_CATEGORY_DATABASES, 70, "fas fa-bolt"),
                                new Skill("Firebase", PortfolioConstants.SKILL_CATEGORY_DATABASES, 78, "fas fa-fire"));
        }

        public List<String> getSkillCategories() {
                return List.of(
                                PortfolioConstants.SKILL_CATEGORY_LANGUAGES,
                                PortfolioConstants.SKILL_CATEGORY_FRAMEWORKS,
                                PortfolioConstants.SKILL_CATEGORY_TOOLS,
                                PortfolioConstants.SKILL_CATEGORY_DATABASES);
        }

        public List<String> getProjectCategories() {
                return List.of(
                                PortfolioConstants.CATEGORY_ALL,
                                PortfolioConstants.CATEGORY_FULLSTACK,
                                PortfolioConstants.CATEGORY_BACKEND,
                                PortfolioConstants.CATEGORY_MOBILE,
                                PortfolioConstants.CATEGORY_AI,
                                PortfolioConstants.CATEGORY_IOT);
        }

        public List<Experience> getAllExperience() {
                return List.of(
                                new Experience(
                                                "Advanced Diploma in Computer Science (NQF Level 7)",
                                                "Tshwane University of Technology (TUT)",
                                                "Jan 2026 \u2013 Dec 2026",
                                                "Currently pursuing Advanced Diploma in Computer Science.",
                                                List.of("Advanced Software Engineering", "System Architecture",
                                                                "Cloud Computing")),
                                new Experience(
                                                "Software Engineer - Work-Integrated Learning",
                                                "Informatics Community Engagement Program (ICEP) | Remote",
                                                "Jul 2025 \u2013 Dec 2025",
                                                "Developed production-grade React.js and Node.js web applications, adhering strictly to Agile and Scrum methodologies. Engineered secure REST APIs utilizing JSON Web Token (JWT) authentication and Role-Based Access Control (RBAC).",
                                                List.of("React.js", "Node.js", "Express.js", "Agile", "Scrum")),
                                new Experience(
                                                "Diploma in Computer Science",
                                                "Tshwane University of Technology (TUT)",
                                                "Feb 2023 \u2013 Dec 2025",
                                                "Qualified Dec 2025. Achieved distinctions in Operating Systems (91%), Object-Oriented Programming (87%), and Advanced OOP (84%).",
                                                List.of("Java", "C++", "SQL", "HTML/CSS", "Kotlin")));
        }

        public List<Achievement> getAllAchievements() {
                return List.of(
                                new Achievement("AWS Academy Cloud Foundations",
                                                "https://www.credly.com/go/7K5FxMdttUOPa2WP06g56g"),
                                new Achievement("Zero Day CTF Certificate",
                                                "/cv/personal-archivements/Mpho Ramaloko Zero Day CTF Cert.pdf"),
                                new Achievement("World Wide CTF Certificate",
                                                "/cv/personal-archivements/WWCTF Cert M Ramaloko.pdf"),
                                new Achievement("Excellence Award (TUT 2024)",
                                                "/cv/personal-archivements/excellence-award-tut-2024.pdf"),
                                new Achievement("Hackathon Certificate (TUT 2023)",
                                                "/cv/personal-archivements/hackathon-cert-tut-2023.pdf"),
                                new Achievement("Hackathon Certificate (UL 2025)",
                                                "/cv/personal-archivements/hackathon-cert-ul-2025.pdf"));
        }

        public List<String> getGalleryImages() {
                return List.of(
                                "/images/ul-varsity_hackathon/IMG_4740.JPG",
                                "/images/ul-varsity_hackathon/IMG_5022.JPG",
                                "/images/ul-varsity_hackathon/IMG_5024.JPG",
                                "/images/workspace-setup/IMG_20241119_205301_583.jpg",
                                "/images/workspace-setup/IMG_20241119_205411_109.jpg",
                                "/images/profile-images/profile2.jpg");
        }
}
