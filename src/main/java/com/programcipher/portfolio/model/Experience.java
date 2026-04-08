package com.programcipher.portfolio.model;

import java.util.List;

public record Experience(
        String title,
        String company,
        String period,
        String description,
        List<String> technologies
) {
}
