package com.inmobi.unifiedId;

import ck.p;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class InMobiUserDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiUserDataTypes f25882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiUserDataTypes f25883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25884c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InMobiUserDataTypes f25885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InMobiUserDataTypes f25886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap f25887c;

        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f25885a, this.f25886b, this.f25887c);
        }

        public final Builder emailId(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f25886b = inMobiUserDataTypes;
            return this;
        }

        public final Builder extras(HashMap<String, String> map) {
            this.f25887c = map;
            return this;
        }

        public final Builder phoneNumber(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f25885a = inMobiUserDataTypes;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f25882a;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f25883b;
        }
        if ((i10 & 4) != 0) {
            map = inMobiUserDataModel.f25884c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public final InMobiUserDataTypes component1() {
        return this.f25882a;
    }

    public final InMobiUserDataTypes component2() {
        return this.f25883b;
    }

    public final HashMap<String, String> component3() {
        return this.f25884c;
    }

    public final InMobiUserDataModel copy(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> map) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        return p.e(this.f25882a, inMobiUserDataModel.f25882a) && p.e(this.f25883b, inMobiUserDataModel.f25883b) && p.e(this.f25884c, inMobiUserDataModel.f25884c);
    }

    public int hashCode() {
        InMobiUserDataTypes inMobiUserDataTypes = this.f25882a;
        int iHashCode = (inMobiUserDataTypes == null ? 0 : inMobiUserDataTypes.hashCode()) * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f25883b;
        int iHashCode2 = (iHashCode + (inMobiUserDataTypes2 == null ? 0 : inMobiUserDataTypes2.hashCode())) * 31;
        HashMap map = this.f25884c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f25882a + ", emailId=" + this.f25883b + ", extras=" + this.f25884c + ")";
    }

    public final InMobiUserDataTypes getEmailId() {
        return this.f25883b;
    }

    public final HashMap<String, String> getExtras() {
        return this.f25884c;
    }

    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f25882a;
    }

    public InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> map) {
        this.f25882a = inMobiUserDataTypes;
        this.f25883b = inMobiUserDataTypes2;
        this.f25884c = map;
    }
}
