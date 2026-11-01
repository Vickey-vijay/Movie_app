package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import ck.p;
import yads.f52;
import yads.g52;
import yads.h52;

/* JADX INFO: loaded from: classes7.dex */
public final class SizeConstraint implements Parcelable, h52 {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeConstraintType f51081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f51082c;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[], still in use, count: 1, list:
  (r4v3 com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[]) from 0x002f: INVOKE (r4v3 com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:50)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class SizeConstraintType implements g52 {
        FIXED(f52.f77304b),
        FIXED_RATIO(f52.f77305c),
        PREFERRED_RATIO(f52.f77306d);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f52 f51084b;

        public static SizeConstraintType valueOf(String str) {
            return (SizeConstraintType) Enum.valueOf(SizeConstraintType.class, str);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[]) f51083c.clone();
        }

        static {
            kotlin.enums.a.a(sizeConstraintTypeArr);
        }

        public final f52 a() {
            return this.f51084b;
        }

        private SizeConstraintType(f52 f52Var) {
            super(str, i);
            this.f51084b = f52Var;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(SizeConstraint.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return getSizeConstraintType() == sizeConstraint.getSizeConstraintType() && getValue() == sizeConstraint.getValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51081b.name());
        parcel.writeFloat(this.f51082c);
    }

    @Override // yads.h52
    public SizeConstraintType getSizeConstraintType() {
        return this.f51081b;
    }

    @Override // yads.h52
    public float getValue() {
        return this.f51082c;
    }

    public SizeConstraint(SizeConstraintType sizeConstraintType, float f10) {
        this.f51081b = sizeConstraintType;
        this.f51082c = f10;
    }

    public int hashCode() {
        return Float.hashCode(getValue()) + (getSizeConstraintType().hashCode() * 31);
    }
}
