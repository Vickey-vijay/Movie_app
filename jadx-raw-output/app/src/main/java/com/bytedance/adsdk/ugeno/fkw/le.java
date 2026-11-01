package com.bytedance.adsdk.ugeno.fkw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class le extends com.bytedance.adsdk.ugeno.vt.ouw<fkw> {
    private int byv;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private int f10861fn;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private int f10862ln;
    private int qni;
    private int smu;

    public static class ouw extends com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw {
        public int bs;

        /* JADX INFO: renamed from: cd, reason: collision with root package name */
        public int f10863cd;
        public int fak;
        public int fvf;
        public float jae;
        public int ksc;

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        public float f10864od;

        /* JADX INFO: renamed from: pd, reason: collision with root package name */
        public int f10865pd;
        public float uq;

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final void ouw(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.ouw(context, str, str2);
            str.hashCode();
            int i10 = 4;
            switch (str) {
                case "flexBasisPercent":
                    this.uq = yu(str2);
                    break;
                case "order":
                    this.ksc = ouw(str2);
                    break;
                case "flexShrink":
                    this.f10864od = lh(str2);
                    break;
                case "flexGrow":
                    this.jae = vt(str2);
                    break;
                case "alignSelf":
                    str2.hashCode();
                    switch (str2) {
                        case "stretch":
                            break;
                        case "baseline":
                            i10 = 3;
                            break;
                        case "center":
                            i10 = 2;
                            break;
                        case "flex_start":
                            i10 = 0;
                            break;
                        case "flex_end":
                            i10 = 1;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                    this.f10863cd = i10;
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final String toString() {
            return "LayoutParams{mWidth=" + this.ouw + ", mHeight=" + this.vt + ", mMargin=" + this.fkw + ", mMarginLeft=" + this.f11007le + ", mMarginRight=" + this.f11009ra + ", mMarginTop=" + this.pno + ", mMarginBottom=" + this.bly + ", mParams=" + this.ex + ", mOrder=" + this.ksc + ", mFlexGrow=" + this.jae + ", mFlexShrink=" + this.f10864od + ", mAlignSelf=" + this.f10863cd + ", mFlexBasisPercent=" + this.uq + ", mMinWidth=" + this.f10865pd + ", mMinHeight=" + this.fvf + ", mMaxWidth=" + this.bs + ", mMaxHeight=" + this.fak + "} " + super.toString();
        }

        public ouw(com.bytedance.adsdk.ugeno.vt.ouw ouwVar) {
            super(ouwVar);
            this.ksc = 1;
            this.jae = 0.0f;
            this.f10864od = 0.0f;
            this.f10863cd = -1;
            this.uq = -1.0f;
            this.f10865pd = -1;
            this.fvf = -1;
            this.bs = ViewCompat.MEASURED_SIZE_MASK;
            this.fak = ViewCompat.MEASURED_SIZE_MASK;
        }

        private static float lh(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0.0f;
            }
        }

        private static float vt(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0.0f;
            }
        }

        private static float yu(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1.0f;
            }
        }

        private static int ouw(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
                return 1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final /* synthetic */ ViewGroup.LayoutParams ouw() {
            fkw.ouw ouwVar = new fkw.ouw((int) this.ouw, (int) this.vt);
            ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin = (int) this.f11007le;
            ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin = (int) this.f11009ra;
            ((ViewGroup.MarginLayoutParams) ouwVar).topMargin = (int) this.pno;
            ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin = (int) this.bly;
            ouwVar.ouw = this.ksc;
            ouwVar.yu = this.f10863cd;
            ouwVar.vt = this.jae;
            ouwVar.f10859lh = this.f10864od;
            ouwVar.fkw = this.uq;
            return ouwVar;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.ouw(str, str2);
        str.hashCode();
        int i10 = 4;
        int i11 = 3;
        switch (str) {
            case "alignItems":
                switch (str2.hashCode()) {
                    case -1881872635:
                        if (str2.equals("stretch")) {
                        }
                        break;
                    case -1720785339:
                        if (str2.equals("baseline")) {
                        }
                        break;
                    case -1364013995:
                        if (str2.equals("center")) {
                        }
                        break;
                    case 1384876188:
                        if (str2.equals("flex_start")) {
                        }
                        break;
                    case 1744442261:
                        if (str2.equals("flex_end")) {
                        }
                        break;
                }
                if (r1 == 0) {
                    i10 = 0;
                } else if (r1 == 1) {
                    i10 = 1;
                } else if (r1 == 2) {
                    i10 = 2;
                } else if (r1 == 3) {
                    i10 = 3;
                }
                this.f10861fn = i10;
                break;
            case "flexDirection":
                str2.hashCode();
                switch (str2) {
                    case "column_reverse":
                        break;
                    case "column":
                        i11 = 2;
                        break;
                    case "row_reverse":
                        i11 = 1;
                        break;
                    default:
                        i11 = 0;
                        break;
                }
                this.f10862ln = i11;
                break;
            case "alignContent":
                switch (str2.hashCode()) {
                    case -1881872635:
                        if (str2.equals("stretch")) {
                        }
                        break;
                    case -1364013995:
                        if (str2.equals("center")) {
                        }
                        break;
                    case -932331738:
                        if (str2.equals("space_around")) {
                        }
                        break;
                    case 1384876188:
                        if (str2.equals("flex_start")) {
                        }
                        break;
                    case 1682480591:
                        if (str2.equals("space_between")) {
                        }
                        break;
                    case 1744442261:
                        if (str2.equals("flex_end")) {
                        }
                        break;
                }
                if (r1 == 0) {
                    i10 = 0;
                } else if (r1 == 1) {
                    i10 = 1;
                } else if (r1 == 2) {
                    i10 = 2;
                } else if (r1 != 3) {
                    i10 = r1 != 4 ? 5 : 3;
                }
                this.byv = i10;
                break;
            case "flexWrap":
                str2.hashCode();
                this.qni = str2.equals("wrap") ? 1 : 0;
                break;
            case "justifyContent":
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                        }
                        break;
                    case -932331738:
                        if (str2.equals("space_around")) {
                        }
                        break;
                    case 1682480591:
                        if (str2.equals("space_between")) {
                        }
                        break;
                    case 1744442261:
                        if (str2.equals("flex_end")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    Method dump skipped, instruction units count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.le.ouw(java.lang.String, java.lang.String):void");
            }

            @Override // com.bytedance.adsdk.ugeno.vt.ouw
            public final com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw bly() {
                return new ouw(this);
            }

            public le(Context context) {
                super(context);
            }

            @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
            public final void vt() {
                super.vt();
                ((fkw) this.fkw).setFlexDirection(this.f10862ln);
                ((fkw) this.fkw).setFlexWrap(this.qni);
                ((fkw) this.fkw).setJustifyContent(this.smu);
                ((fkw) this.fkw).setAlignItems(this.f10861fn);
                ((fkw) this.fkw).setAlignContent(this.byv);
            }

            @Override // com.bytedance.adsdk.ugeno.vt.lh
            public final /* synthetic */ View ouw() {
                fkw fkwVar = new fkw(this.vt);
                fkwVar.ouw = this;
                return fkwVar;
            }
        }
