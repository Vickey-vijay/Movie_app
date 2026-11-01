package com.bytedance.adsdk.ugeno.bly.le;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.lh;

/* JADX INFO: loaded from: classes11.dex */
public class vt extends lh<ouw> {
    private float ajl;
    private TextUtils.TruncateAt baa;
    private int byv;
    private int ehk;
    private int eot;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    @Deprecated
    private TextUtils.TruncateAt f10768fg;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private int f10769fn;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f10770ki;
    private float kq;

    @Deprecated
    private float lai;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public int f10771ln;
    private boolean mu;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private float f10772nn;
    public String ouw;
    private float qni;

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    private float f10773sm;
    private float smu;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private float f10774vf;

    @Deprecated
    private float xne;
    private int xwt;
    private float zjq;

    private void ouw(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((ouw) this.fkw).setEllipsize(truncateAt);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void ouw(String str, String str2) {
        byte b10;
        byte b11;
        int i10;
        int i11;
        if (TextUtils.isEmpty(str)) {
        }
        super.ouw(str, str2);
        str.hashCode();
        int i12 = 2;
        switch (str) {
            case "shadowRadius":
                b10 = 0;
                break;
            case "shadowColor":
                b10 = 1;
                break;
            case "shadowOffsetX":
                b10 = 2;
                break;
            case "shadowOffsetY":
                b10 = 3;
                break;
            case "textAlign":
                b10 = 4;
                break;
            case "textColor":
                b10 = 5;
                break;
            case "textStyle":
                b10 = 6;
                break;
            case "shadowBlur":
                b10 = 7;
                break;
            case "textSize":
                b10 = 8;
                break;
            case "textDecoration":
                b10 = 9;
                break;
            case "shadowDx":
                b10 = 10;
                break;
            case "shadowDy":
                b10 = 11;
                break;
            case "fontWeight":
                b10 = 12;
                break;
            case "lineHeight":
                b10 = 13;
                break;
            case "text":
                b10 = 14;
                break;
            case "lines":
                b10 = 15;
                break;
            case "ellipsis":
                b10 = 16;
                break;
            case "minTextSize":
                b10 = 17;
                break;
            case "maxLines":
                b10 = 18;
                break;
            case "ellipsize":
                b10 = 19;
                break;
            case "letterSpacing":
                b10 = 20;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 7:
                this.f10774vf = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 1:
                this.eot = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                this.mu = true;
                break;
            case 2:
                this.ajl = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case 3:
                this.f10773sm = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case 4:
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1364013995:
                        b11 = !str2.equals("center") ? (byte) -1 : (byte) 0;
                        break;
                    case -348726240:
                        b11 = !str2.equals("center_vertical") ? (byte) -1 : (byte) 1;
                        break;
                    case 3317767:
                        b11 = !str2.equals("left") ? (byte) -1 : (byte) 2;
                        break;
                    case 108511772:
                        b11 = !str2.equals("right") ? (byte) -1 : (byte) 3;
                        break;
                    case 1063616078:
                        b11 = !str2.equals("center_horizontal") ? (byte) -1 : (byte) 4;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        i10 = 17;
                        break;
                    case 1:
                        i10 = 16;
                        break;
                    case 2:
                    default:
                        i10 = 3;
                        break;
                    case 3:
                        i10 = 5;
                        break;
                    case 4:
                        i10 = 1;
                        break;
                }
                this.f10770ki = i10;
                break;
            case 5:
                this.f10771ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case 6:
                int iHashCode = str2.hashCode();
                if (iHashCode != -1178781136) {
                    if (iHashCode != -1039745817) {
                        if (iHashCode == 3029637 && str2.equals("bold")) {
                        }
                    } else if (str2.equals("normal")) {
                    }
                } else if (str2.equals("italic")) {
                }
                if (r10 == 0) {
                    i12 = 1;
                } else if (r10 != 1) {
                    i12 = 0;
                }
                this.f10769fn = i12;
                break;
            case 8:
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 9:
                str2.hashCode();
                switch (str2) {
                    case "underline":
                        i11 = 8;
                        break;
                    case "strikethrough":
                        i11 = 16;
                        break;
                    case "none":
                    default:
                        i11 = Integer.MAX_VALUE;
                        break;
                }
                this.xwt = i11;
                break;
            case 10:
                this.xne = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 11:
                this.lai = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 12:
                float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                this.zjq = fOuw;
                if (fOuw < 1.0f || fOuw > 1000.0f) {
                    this.zjq = 400.0f;
                }
                break;
            case 13:
                this.f10772nn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case 14:
                this.ouw = str2;
                break;
            case 15:
                this.ehk = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                break;
            case 16:
                this.baa = TextUtils.equals(str2, "none") ? null : TextUtils.TruncateAt.END;
                break;
            case 17:
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                break;
            case 18:
                int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, Integer.MAX_VALUE);
                this.byv = iOuw > 0 ? iOuw : Integer.MAX_VALUE;
                break;
            case 19:
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                        }
                        break;
                    case 100571:
                        if (str2.equals("end")) {
                        }
                        break;
                    case 109757538:
                        if (str2.equals("start")) {
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
                    Method dump skipped, instruction units count: 950
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bly.le.vt.ouw(java.lang.String, java.lang.String):void");
            }

            public void ryl(String str) {
                this.ouw = str;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (TextUtils.equals("null", str)) {
                    this.ouw = "";
                }
                ((ouw) this.fkw).setText(this.ouw);
            }

            public vt(Context context) {
                super(context);
                this.f10771ln = ViewCompat.MEASURED_STATE_MASK;
                this.qni = 12.0f;
                this.smu = -1.0f;
                this.byv = Integer.MAX_VALUE;
                this.f10770ki = GravityCompat.START;
                this.baa = TextUtils.TruncateAt.END;
                this.f10772nn = -1.0f;
                this.zjq = 400.0f;
            }

            @Override // com.bytedance.adsdk.ugeno.vt.lh
            public void vt() {
                super.vt();
                if (TextUtils.equals("null", this.ouw)) {
                    this.ouw = "";
                }
                ryl(this.ouw);
                boolean z10 = true;
                ((ouw) this.fkw).setTextSize(1, this.qni);
                ((ouw) this.fkw).setTextColor(this.f10771ln);
                ((ouw) this.fkw).setLines(this.ehk);
                ((ouw) this.fkw).setMaxLines(this.byv);
                ((ouw) this.fkw).setGravity(this.f10770ki);
                ((ouw) this.fkw).setIncludeFontPadding(false);
                ((ouw) this.fkw).setMinTextSize(ra.ouw(this.vt, this.smu));
                int i10 = this.xwt;
                this.xwt = i10;
                if (i10 != Integer.MAX_VALUE) {
                    ((ouw) this.fkw).setPaintFlags(i10);
                }
                if (ex()) {
                    ouw(this.baa);
                } else {
                    ouw(this.f10768fg);
                }
                if (this.f10772nn > 0.0f) {
                    if (ex()) {
                        float f10 = this.f10772nn;
                        if (f10 <= 3.0f) {
                            ((ouw) this.fkw).setLineSpacing(0.0f, f10);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            int iRound = Math.round(ra.ouw(this.vt, (f10 - (this.qni * 1.2f)) / 2.0f));
                            int paddingTop = ((ouw) this.fkw).getPaddingTop() + iRound;
                            int paddingBottom = ((ouw) this.fkw).getPaddingBottom() + iRound;
                            T t10 = this.fkw;
                            ((ouw) t10).setPadding(((ouw) t10).getPaddingLeft(), paddingTop, ((ouw) this.fkw).getPaddingRight(), paddingBottom);
                            ((ouw) this.fkw).setLineHeight(Math.round(ra.ouw(this.vt, this.f10772nn)));
                        }
                    } else {
                        ((ouw) this.fkw).setLineSpacing(0.0f, this.f10772nn);
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                ((ouw) this.fkw).setBreakStrategy(0);
                if (ex()) {
                    if (this.mu) {
                        if (this.f10774vf <= 0.0f) {
                            this.f10774vf = 1.0E-5f;
                        }
                        ((ouw) this.fkw).setShadowLayer(this.f10774vf, this.ajl, this.f10773sm, this.eot);
                    }
                } else {
                    ((ouw) this.fkw).setShadowLayer(this.f10774vf, this.xne, this.lai, this.eot);
                }
                int i12 = this.f10769fn;
                if (i12 == 1) {
                    ((ouw) this.fkw).setTypeface(Typeface.DEFAULT, i12);
                } else if (i11 >= 28) {
                    Typeface typeface = Typeface.DEFAULT;
                    int i13 = (int) this.zjq;
                    if (i12 != 2) {
                        z10 = false;
                    }
                    ((ouw) this.fkw).setTypeface(Typeface.create(typeface, i13, z10));
                } else if (this.zjq >= 500.0f) {
                    ((ouw) this.fkw).setTypeface(Typeface.DEFAULT, 1);
                }
                if (ra.ouw(this.vt, this.qni) > 0.0f) {
                    ((ouw) this.fkw).setLetterSpacing(this.kq / ra.ouw(this.vt, this.qni));
                }
            }

            @Override // com.bytedance.adsdk.ugeno.vt.lh
            public final /* synthetic */ View ouw() {
                ouw ouwVar = new ouw(this.vt);
                ouwVar.ouw = this;
                return ouwVar;
            }
        }
