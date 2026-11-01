package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: loaded from: classes6.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final String name;

    public static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }

    public String getName() {
        return this.name;
    }

    ScarBiddingManagerType(String str) {
        this.name = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public static ScarBiddingManagerType fromName(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != 99470) {
            if (iHashCode == 100171 && str.equals("eag")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str.equals("dis")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            return DISABLED;
        }
        return EAGER;
    }
}
