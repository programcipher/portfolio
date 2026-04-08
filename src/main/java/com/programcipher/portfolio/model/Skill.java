package com.programcipher.portfolio.model;

public record Skill(
        String name,
        String category,
        int proficiencyPercent,
        String iconClass
) {
}
