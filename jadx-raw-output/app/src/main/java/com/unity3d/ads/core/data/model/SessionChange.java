package com.unity3d.ads.core.data.model;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;

/* JADX INFO: compiled from: SessionChange.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class SessionChange {

    /* JADX INFO: compiled from: SessionChange.kt */
    public static final class PrivacyFsmChange extends SessionChange {
        private final ByteString value;

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final PrivacyFsmChange copy(ByteString byteString) {
            p.j(byteString, "value");
            return new PrivacyFsmChange(byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && p.e(this.value, ((PrivacyFsmChange) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }

        public final ByteString getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(ByteString byteString) {
            super(null);
            p.j(byteString, "value");
            this.value = byteString;
        }
    }

    /* JADX INFO: compiled from: SessionChange.kt */
    public static final class UserConsentChange extends SessionChange {
        private final ByteString value;

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final UserConsentChange copy(ByteString byteString) {
            p.j(byteString, "value");
            return new UserConsentChange(byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && p.e(this.value, ((UserConsentChange) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }

        public final ByteString getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(ByteString byteString) {
            super(null);
            p.j(byteString, "value");
            this.value = byteString;
        }
    }

    private SessionChange() {
    }

    public /* synthetic */ SessionChange(i iVar) {
        this();
    }
}
