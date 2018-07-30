package com.bookingshelf.entity;

/**
 *  permission enum('L', 'M', 'A', 'O') NOT NULL,
 *  L - low, M - medium, A - admin, O - owner*
 */
public enum Permission {

    LOW("L"),
    MEDIUM("M"),
    ADMIN("A"),
    OWNER("O");

    private String code;

    Permission(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Permission fromCode(String code) {
        for (Permission permission :Permission.values()){
            if (permission.getCode().equals(code)){
                return permission;
            }
        }
        throw new UnsupportedOperationException(
                "The code " + code + " is not supported!");
    }
}
