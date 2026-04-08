package com.programcipher.portfolio.controller;

import com.programcipher.portfolio.config.PortfolioConstants;
import com.programcipher.portfolio.service.PortfolioDataProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    private final PortfolioDataProvider dataProvider;

    public PortfolioController(PortfolioDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("ownerName", PortfolioConstants.OWNER_NAME);
        model.addAttribute("ownerTitle", PortfolioConstants.OWNER_TITLE);
        model.addAttribute("ownerTagline", PortfolioConstants.OWNER_TAGLINE);
        model.addAttribute("ownerEmail", PortfolioConstants.OWNER_EMAIL);
        model.addAttribute("ownerPhone", PortfolioConstants.OWNER_PHONE);
        model.addAttribute("ownerGithub", PortfolioConstants.OWNER_GITHUB);
        model.addAttribute("ownerLinkedin", PortfolioConstants.OWNER_LINKEDIN);
        model.addAttribute("ownerLocation", PortfolioConstants.OWNER_LOCATION);
        model.addAttribute("bioOne", PortfolioConstants.BIO_PARAGRAPH_ONE);
        model.addAttribute("bioTwo", PortfolioConstants.BIO_PARAGRAPH_TWO);
        model.addAttribute("yearsExperience", PortfolioConstants.YEARS_EXPERIENCE);
        model.addAttribute("projectsCompleted", PortfolioConstants.PROJECTS_COMPLETED);
        model.addAttribute("technologiesUsed", PortfolioConstants.TECHNOLOGIES_USED);
        model.addAttribute("heroPrimary", PortfolioConstants.HERO_CTA_PRIMARY);
        model.addAttribute("heroSecondary", PortfolioConstants.HERO_CTA_SECONDARY);
        model.addAttribute("footerText", PortfolioConstants.FOOTER_TEXT);

        model.addAttribute("projects", dataProvider.getAllProjects());
        model.addAttribute("featuredProjects", dataProvider.getFeaturedProjects());
        model.addAttribute("projectCategories", dataProvider.getProjectCategories());
        model.addAttribute("skills", dataProvider.getAllSkills());
        model.addAttribute("skillCategories", dataProvider.getSkillCategories());
        model.addAttribute("experiences", dataProvider.getAllExperience());
        model.addAttribute("achievements", dataProvider.getAllAchievements());
        model.addAttribute("gallery", dataProvider.getGalleryImages());

        model.addAttribute("navItems", new String[]{
                PortfolioConstants.NAV_HOME,
                PortfolioConstants.NAV_ABOUT,
                PortfolioConstants.NAV_SKILLS,
                PortfolioConstants.NAV_PROJECTS,
                PortfolioConstants.NAV_EXPERIENCE,
                "Gallery",
                PortfolioConstants.NAV_CONTACT
        });

        return "index";
    }
}
