package com.programcipher.portfolio.model;

import java.util.List;

public record Project(
        String name,
        String description,
        List<String> techStack,
        String githubUrl,
        String liveUrl,
        String imageUrl,
        String category,
        boolean featured
) {
}
