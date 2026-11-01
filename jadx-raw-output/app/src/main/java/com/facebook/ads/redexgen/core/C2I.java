package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.MediaItem;
import com.facebook.ads.androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2I {
    public static String[] A0B = {"HPaW60WB4gFqlzK247iq3uDphWK03Iif", "KBvaSaTKxPBSHh58MHpb5CG0KegQKkr9", "b1r5E5Hd4zdNoyuaEQVQsO4l4ctoImRB", "nKy6zg3qdMWmj624cOZmm65wxaqanW8E", "pbs", "7xj4kZWUPnGFCehZwFfpDVbkpfFBWPXP", "TYkILCf2Xs5AkCVGSR3QMYIpsRVtVxUs", "J3EyGmSR6mO6g6CSn2CxG4G4HI4UvZHg"};
    public Uri A00;
    public C2643og A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public C2J A01 = new C2J();
    public C2L A02 = new C2L();
    public List<StreamKey> A09 = Collections.emptyList();
    public List<MediaItem.SubtitleConfiguration> A0A = Collections.emptyList();
    public C2O A03 = new C2O();

    public final C2I A00(Uri uri) {
        this.A00 = uri;
        return this;
    }

    public final C2I A01(Object obj) {
        this.A05 = obj;
        return this;
    }

    public final C2I A02(String str) {
        this.A06 = str;
        return this;
    }

    public final C2I A03(String str) {
        this.A07 = (String) C3M.A01(str);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public final C2I A04(List<StreamKey> list) {
        List<StreamKey> listEmptyList;
        if (list != null) {
            boolean zIsEmpty = list.isEmpty();
            String[] strArr = A0B;
            if (strArr[1].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            A0B[3] = "MqTMGNvSZ5CI9kiBQqDgyIk0OkVIIG8t";
            if (!zIsEmpty) {
                listEmptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                listEmptyList = Collections.emptyList();
            }
        } else {
            listEmptyList = Collections.emptyList();
        }
        this.A09 = listEmptyList;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final C2645oi A05() {
        boolean z10;
        if (this.A02.A00 != null) {
            C2L c2l = this.A02;
            if (A0B[3].charAt(22) == '1') {
                throw new RuntimeException();
            }
            A0B[5] = "LsaTJZF6o4X1Tfg01qMfqEHPxyZhwdJj";
            if (c2l.A03 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        C3M.A08(z10);
        C2646oj c2646oj = null;
        Uri uri = this.A00;
        if (uri != null) {
            c2646oj = new C2646oj(uri, this.A08, this.A02.A03 != null ? this.A02.A08() : null, null, this.A09, this.A06, this.A0A, this.A05);
        }
        return new C2645oi(this.A07 != null ? this.A07 : "", this.A01.A0B(), c2646oj, this.A03.A05(), this.A04 != null ? this.A04 : C2643og.A0Z);
    }
}
