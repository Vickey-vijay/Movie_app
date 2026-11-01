package org.eclipse.jetty.security;

/* JADX INFO: loaded from: classes2.dex */
public enum UserDataConstraint {
    None,
    Integral,
    Confidential;

    public static UserDataConstraint get(int i10) {
        if (i10 >= -1 && i10 <= 2) {
            return i10 == -1 ? None : values()[i10];
        }
        throw new IllegalArgumentException("Expected -1, 0, 1, or 2, not: " + i10);
    }

    public UserDataConstraint combine(UserDataConstraint userDataConstraint) {
        if (compareTo(userDataConstraint) < 0) {
            return this;
        }
        return userDataConstraint;
    }
}
