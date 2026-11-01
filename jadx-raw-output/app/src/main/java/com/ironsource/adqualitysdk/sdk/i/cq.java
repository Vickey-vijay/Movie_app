package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class cq {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1393 = -2696279443224279490L;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1394 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f1395 = {'/', 'a', 'c', 't', 'i', 'v', 'y', 'w', 'n', 'd', 'o', 'L', 'f', 'e', 'l', 'p', 'F', 'u', 's', 'M', 'h', ' ', 'r', 'A', 'N', 'm', 'V', 'C', 'j', 'P', 'x', 'T', 'I', 'E', 'J', 'S', 'B', '.', '_', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1396 = 7;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1397;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private x f1398;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private cm f1399;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jo f1400;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1401;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jh f1402 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private du f1403;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ch f1404;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hs f1405;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private db f1406;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1407;

    public class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$a$1, reason: invalid class name */
        public class AnonymousClass1 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1477;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1478;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ r f1479;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1480;

            public AnonymousClass1(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1479 = rVar;
                this.f1477 = jSONObject;
                this.f1480 = obj;
                this.f1478 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1479.mo262(this.f1477, this.f1480, this.f1478);
            }
        }
    }

    public class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$b$3, reason: invalid class name */
        public class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ r f1481;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1482;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1483;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1484;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1485;

            public AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1481 = rVar;
                this.f1484 = jSONObject;
                this.f1485 = obj;
                this.f1482 = obj2;
                this.f1483 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1481.mo1704(this.f1484, this.f1485, this.f1482, this.f1483);
            }
        }
    }

    public class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$c$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1486;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1487;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1488;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1489;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1487 = rVar;
                this.f1488 = jSONObject;
                this.f1486 = obj;
                this.f1489 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1487.mo1706(this.f1488, this.f1486, this.f1489);
            }
        }
    }

    public class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$d$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1490;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1491;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1492;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1493;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ r f1494;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1494 = rVar;
                this.f1490 = jSONObject;
                this.f1493 = obj;
                this.f1491 = obj2;
                this.f1492 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1494.mo1713(this.f1490, this.f1493, this.f1491, this.f1492);
            }
        }
    }

    public class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$e$3, reason: invalid class name */
        public class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1495;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1496;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1497;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1498;

            public AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1496 = rVar;
                this.f1495 = jSONObject;
                this.f1497 = obj;
                this.f1498 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1496.mo267(this.f1495, this.f1497, this.f1498);
            }
        }
    }

    public class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$f$4, reason: invalid class name */
        public class AnonymousClass4 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1499;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1500;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1501;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ r f1502;

            public AnonymousClass4(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1502 = rVar;
                this.f1501 = jSONObject;
                this.f1499 = obj;
                this.f1500 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1502.mo1712(this.f1501, this.f1499, this.f1500);
            }
        }
    }

    public class h<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$h$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1503;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1504;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1505;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1506;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1504 = rVar;
                this.f1503 = jSONObject;
                this.f1505 = obj;
                this.f1506 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1504.mo1703(this.f1503, this.f1505, this.f1506);
            }
        }
    }

    public class j<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$j$2, reason: invalid class name */
        public class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1507;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1508;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1509;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1510;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1511;

            public AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1509 = rVar;
                this.f1508 = jSONObject;
                this.f1507 = obj;
                this.f1511 = obj2;
                this.f1510 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1509.mo1709(this.f1508, this.f1507, this.f1511, this.f1510);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1652(cq cqVar, String str, boolean z10, boolean z11, List list) {
        int i10 = f1394 + 77;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        cqVar.m1647(str, z10, z11, list);
        int i12 = f1397 + 67;
        f1394 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ du m1666(cq cqVar) {
        int i10 = f1394 + 35;
        int i11 = i10 % 128;
        f1397 = i11;
        int i12 = i10 % 2;
        du duVar = cqVar.f1403;
        int i13 = i11 + 41;
        f1394 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return duVar;
        }
        int i14 = 58 / 0;
        return duVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1677(cq cqVar, im imVar, boolean z10) {
        int i10 = f1394 + 5;
        f1397 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'M' : '5';
        cqVar.m1654(imVar, z10);
        if (c10 == 'M') {
            int i11 = 52 / 0;
        }
        int i12 = f1397 + 53;
        f1394 = i12 % 128;
        if ((i12 % 2 == 0 ? 'P' : 'T') == 'T') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hs m1688() {
        hs hsVar;
        int i10 = f1394;
        int i11 = i10 + 97;
        f1397 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 6 : (char) 25) != 6) {
            hsVar = this.f1405;
        } else {
            hsVar = this.f1405;
            int i12 = 98 / 0;
        }
        int i13 = i10 + 49;
        f1397 = i13 % 128;
        int i14 = i13 % 2;
        return hsVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m1691() {
        int i10 = f1397 + 37;
        int i11 = i10 % 128;
        f1394 = i11;
        int i12 = i10 % 2;
        JSONObject jSONObject = this.f1401;
        int i13 = i11 + 123;
        f1397 = i13 % 128;
        int i14 = i13 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private ch m1637() {
        ch chVar = new ch() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ch
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1544(final String str, final List<Object> list) {
                final boolean z10 = true;
                final boolean z11 = false;
                cq.m1652(cq.this, str, true, false, list);
                cq.m1677(cq.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        cq.m1652(cq.this, str, false, z11, list);
                    }
                }, false);
                cq.m1677(cq.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        cq.m1652(cq.this, str, false, z10, list);
                    }
                }, true);
            }
        };
        int i10 = f1397 + 119;
        f1394 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 27 : (char) 25) != 27) {
            return chVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private jh m1638() {
        jh jhVar = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cq cqVar = cq.this;
                cqVar.m1692(ih.f2508, cq.m1669(cqVar, activity, (Bundle) null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cq cqVar = cq.this;
                cqVar.m1692(ih.f2509, cq.m1669(cqVar, activity, (Bundle) null));
            }
        };
        int i10 = f1394 + 75;
        f1397 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jhVar;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private void m1639() {
        int i10 = f1394 + 67;
        f1397 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f1398.m3062();
            int i11 = 85 / 0;
        } else {
            this.f1398.m3062();
        }
        int i12 = f1394 + 11;
        f1397 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m1640() {
        int i10 = f1394 + 105;
        f1397 = i10 % 128;
        if ((i10 % 2 != 0 ? '_' : (char) 30) != '_') {
            this.f1398.m3060();
        } else {
            this.f1398.m3060();
            int i11 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1641() {
        int i10 = f1397 + 19;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        for (Cdo cdo : m1688().m2335()) {
            if (m1680(cdo)) {
                int i12 = f1394 + 45;
                f1397 = i12 % 128;
                char c10 = i12 % 2 != 0 ? 'J' : 'B';
                m1653(cdo);
                if (c10 != 'B') {
                    int i13 = 89 / 0;
                } else {
                    continue;
                }
            }
            int i14 = f1394 + 33;
            f1397 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m1642() {
        int i10 = f1394 + 101;
        f1397 = i10 % 128;
        if ((i10 % 2 != 0 ? 'V' : 'X') != 'X') {
            this.f1398.m3058();
            int i11 = 76 / 0;
        } else {
            this.f1398.m3058();
        }
        int i12 = f1394 + 69;
        f1397 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private dp m1643() {
        int i10 = f1397 + 91;
        f1394 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m1695().m1601();
        }
        m1695().m1601();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m1662(JSONObject jSONObject) {
        int i10 = f1397 + 31;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM1686 = m1686();
        jz.m2795(jSONObjectM1686, jSONObject);
        int i12 = f1397 + 99;
        f1394 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Y' : (char) 29) != 'Y') {
            return jSONObjectM1686;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1669(cq cqVar, Activity activity, Bundle bundle) {
        int i10 = f1397 + 39;
        f1394 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\"' : (char) 15;
        JSONObject jSONObjectM1675 = cqVar.m1675(activity, bundle);
        if (c10 == '\"') {
            int i11 = 47 / 0;
        }
        int i12 = f1394 + 53;
        f1397 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectM1675;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1679(Activity activity, List list) {
        int i10 = f1394 + 49;
        f1397 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1657(activity, (List<String>) list);
        }
        m1657(activity, (List<String>) list);
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final void m1681() {
        int i10 = f1397 + 31;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        m1639();
        m1640();
        m1642();
        if ((this.f1402 != null ? (char) 0 : 'a') != 'a') {
            jj.m2676().m2678(this.f1402);
            this.f1402 = null;
        }
        jo joVar = this.f1400;
        if ((joVar != null ? (char) 15 : 'U') == 15) {
            int i12 = f1394 + 125;
            f1397 = i12 % 128;
            int i13 = i12 % 2;
            joVar.m2704();
            this.f1400 = null;
            int i14 = f1394 + 77;
            f1397 = i14 % 128;
            int i15 = i14 % 2;
        }
        this.f1404 = null;
        int i16 = f1394 + 13;
        f1397 = i16 % 128;
        if (!(i16 % 2 != 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final db m1682() {
        int i10 = f1397 + 119;
        int i11 = i10 % 128;
        f1394 = i11;
        if ((i10 % 2 == 0 ? '?' : '!') == '?') {
            throw null;
        }
        db dbVar = this.f1406;
        int i12 = i11 + 121;
        f1397 = i12 % 128;
        if ((i12 % 2 != 0 ? 'K' : '_') != 'K') {
            return dbVar;
        }
        int i13 = 81 / 0;
        return dbVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1683() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1695().m1608());
        sb2.append(m1660("\u0093", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 100)).intern());
        sb2.append(m1688().m2338());
        String string = sb2.toString();
        int i10 = f1397 + 21;
        f1394 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final ch m1684() {
        int i10 = f1397 + 69;
        int i11 = i10 % 128;
        f1394 = i11;
        int i12 = i10 % 2;
        ch chVar = this.f1404;
        int i13 = i11 + 107;
        f1397 = i13 % 128;
        int i14 = i13 % 2;
        return chVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m1685() {
        int i10 = f1397 + 87;
        f1394 = i10 % 128;
        if ((i10 % 2 == 0 ? '@' : '6') == '6') {
            return this.f1403;
        }
        int i11 = 0 / 0;
        return this.f1403;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ds m1687(String str) {
        int i10 = f1397 + 103;
        f1394 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        ds dsVarM2337 = m1688().m2337(str);
        int i11 = f1397 + 107;
        f1394 = i11 % 128;
        int i12 = i11 % 2;
        return dsVarM2337;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Context m1689() {
        int i10 = f1394 + 59;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        Context contextM1599 = m1695().m1599();
        int i12 = f1397 + 95;
        f1394 = i12 % 128;
        if (i12 % 2 != 0) {
            return contextM1599;
        }
        int i13 = 99 / 0;
        return contextM1599;
    }

    public cq(cm cmVar, db dbVar, bd bdVar, hs hsVar, du duVar) {
        this.f1405 = hsVar;
        du duVar2 = new du(new HashMap(), duVar, true);
        this.f1403 = duVar2;
        duVar2.m2107(m1688().m2340());
        duVar.m2109(hsVar.m2338(), this);
        this.f1406 = dbVar;
        this.f1407 = bdVar;
        this.f1404 = m1637();
        this.f1399 = cmVar;
        this.f1398 = new x();
        m1655(m1659("왬釮椹셎颞烒졁ꎩ篚팊ꭟʍ\uda27뉡ල\ue5d7뵀ᕒ\uecea䐸ᱮ\uf78e俑✑ﺯ囩⸹", 22453 - (Process.myTid() >> 22)).intern(), new ArrayList());
        m1641();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1690(JSONObject jSONObject) {
        int i10 = f1394 + 43;
        f1397 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        this.f1401 = jz.m2806(jSONObject, true);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final bd m1693() {
        bd bdVar;
        int i10 = f1397 + 27;
        int i11 = i10 % 128;
        f1394 = i11;
        if ((i10 % 2 == 0 ? '=' : 'W') != '=') {
            bdVar = this.f1407;
        } else {
            bdVar = this.f1407;
            int i12 = 26 / 0;
        }
        int i13 = i11 + 105;
        f1397 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return bdVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final cm m1695() {
        int i10 = f1397 + 43;
        int i11 = i10 % 128;
        f1394 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        cm cmVar = this.f1399;
        int i12 = i11 + 89;
        f1397 = i12 % 128;
        int i13 = i12 % 2;
        return cmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1653(Cdo cdo) {
        byte b10;
        String strM2029 = cdo.m2029();
        switch (strM2029.hashCode()) {
            case -1825565413:
                if ((strM2029.equals(m1660("\u0002\u0003\u0004\u0005\u0006\u0005\u0004\u0000\u0012\u000b\r\u0007\u0003\u0000\u0000\u0010À", 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (91 - (Process.myTid() >> 22))).intern()) ? '+' : 'M') == 'M') {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1655966961:
                if (!strM2029.equals(m1660("\u0002\u0003\u0004\u0005\u0006\u0005\u0004\u0000", 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (77 - (Process.myPid() >> 22))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -787751952:
                if (!strM2029.equals(m1660("\u000b\u0000\t\n\u000b\b", 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((Process.myPid() >> 22) + 7)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 3619493:
                if (!strM2029.equals(m1659("왈湒陑㹆", Color.red(0) + 43013).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1397 + 65;
                    f1394 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 1;
                }
                break;
            case 1144592183:
                if ((strM2029.equals(m1660("\b\u0016\u0010\u0011\t\u0003\u0012\u0013", 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (36 - TextUtils.getOffsetBefore("", 0))).intern()) ? (char) 5 : '+') == 5) {
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            m1646(cdo);
            m1678(m1660("\u0002\u0003\u0004\u0005\u0006\u0005\u0004\u0000", View.getDefaultSize(0, 0) + 8, (byte) (77 - TextUtils.indexOf("", "", 0))).intern(), cdo);
            int i12 = f1397 + 35;
            f1394 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 63 / 0;
                return;
            }
            return;
        }
        if (b10 == 1) {
            m1663(cdo);
            m1678(m1659("왈湒陑㹆", 43013 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), cdo);
            return;
        }
        if (b10 == 2) {
            m1670(cdo);
            m1678(m1660("\u000b\u0000\t\n\u000b\b", (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, (byte) (7 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), cdo);
            return;
        }
        if (b10 != 3) {
            if (b10 != 4) {
                return;
            }
            this.f1400 = new jo(m1650(m1661(cdo.m2028())));
        } else if (this.f1402 == null) {
            int i14 = f1397 + 23;
            f1394 = i14 % 128;
            if (!(i14 % 2 == 0)) {
                this.f1402 = m1672(m1661(cdo.m2028()));
                jj.m2676().m2679(this.f1402);
            } else {
                this.f1402 = m1672(m1661(cdo.m2028()));
                jj.m2676().m2679(this.f1402);
                int i15 = 1 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1670(Cdo cdo) {
        JSONObject jSONObjectM1676 = m1676(cdo.m2025());
        if (jSONObjectM1676 == null) {
            return;
        }
        int i10 = f1397 + 55;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        m1648(jSONObjectM1676, m1644(false), m1644(true));
        int i12 = f1394 + 77;
        f1397 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m1696(il ilVar) {
        int i10 = f1394 + 21;
        f1397 = i10 % 128;
        if ((i10 % 2 != 0 ? '<' : ';') == ';') {
            this.f1399.m1600().m760(ilVar);
        } else {
            this.f1399.m1600().m760(ilVar);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1678(String str, Cdo cdo) {
        JSONObject jSONObjectM1676 = m1676(cdo.m2025());
        if (jSONObjectM1676 != null) {
            if ((jSONObjectM1676.has(m1659("왊ꯠᴩ轎炒\ue20f命㦝ꯓᵤ躠烌\ue21d垭㧄\uab18ᵞ躚", 28082 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) ? 'J' : (char) 28) != 28) {
                jn.e eVarM2697 = jn.e.m2697(jSONObjectM1676.optString(m1659("왊ꯠᴩ轎炒\ue20f命㦝ꯓᵤ躠烌\ue21d垭㧄\uab18ᵞ躚", 28081 - View.getDefaultSize(0, 0)).intern(), null));
                String strM1645 = m1645(str, jSONObjectM1676);
                if (eVarM2697 != null) {
                    int i10 = f1394 + 79;
                    f1397 = i10 % 128;
                    int i11 = i10 % 2;
                    jn.m2688().m2693(strM1645, eVarM2697);
                }
            }
        }
        int i12 = f1397 + 119;
        f1394 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final JSONObject m1686() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        boolean z10 = false;
        try {
            jSONObjectJsonObjectInit.put(ih.f2544, m1695().m1612());
            jSONObjectJsonObjectInit.put(ih.f2499, m1695().m1602());
            jSONObjectJsonObjectInit.put(ih.f2497, m1695().m1611());
        } catch (JSONException e10) {
            String strIntern = m1659("왬ဘ櫕䒘齆\ue914쏭ᶏ瑪丌飓\uf2ab쵿✷燱䮡", (ViewConfiguration.getPressedStateDuration() >> 16) + 54851).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1659("왻썅챞쥊퉨\udf33\ud86b\ue573\uee13\ueb0e\uf410\uf134屮蜬聠跜雘鏂鳲駡ꊪ꿩ꢋ떞뺈믥䓴", View.resolveSizeAndState(0, 0, 0) + 1289).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m2810(strIntern, sb2.toString());
        }
        int i10 = f1397 + 49;
        f1394 = i10 % 128;
        if (i10 % 2 == 0) {
            z10 = true;
        }
        if (!z10) {
            return jSONObjectJsonObjectInit;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1646(Cdo cdo) {
        int i10 = f1397 + 35;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM1676 = m1676(cdo.m2025());
        if ((jSONObjectM1676 != null ? '3' : 'L') != 'L') {
            int i12 = f1394 + 1;
            f1397 = i12 % 128;
            int i13 = i12 % 2;
            final String strM2024 = cdo.m2024();
            is isVar = null;
            if ((TextUtils.isEmpty(strM2024) ? '<' : '3') != '<') {
                int i14 = f1394 + 17;
                f1397 = i14 % 128;
                int i15 = i14 % 2;
                final ds dsVarM1687 = m1687(strM2024);
                if (dsVarM1687 != null) {
                    isVar = new is() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.5

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f1451 = 1;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f1452 = 0;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char[] f1453 = {'R', 'e', 'm', 'o', 't', 'A', 'd', 'L', 'i', 's', 'n', 'r', 'E', ' ', 'g', 'w', 'b', 'V', 'f', 'S', 'T', 'U', 'W', 'X', 'Y'};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char f1454 = 5;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m1736(String str, int i16, byte b10) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (g.f2129) {
                                char[] cArr2 = f1453;
                                char c10 = f1454;
                                char[] cArr3 = new char[i16];
                                if (i16 % 2 != 0) {
                                    i16--;
                                    cArr3[i16] = (char) (cArr[i16] - b10);
                                }
                                if (i16 > 1) {
                                    g.f2134 = 0;
                                    while (true) {
                                        int i17 = g.f2134;
                                        if (i17 >= i16) {
                                            break;
                                        }
                                        g.f2133 = cArr[i17];
                                        g.f2131 = cArr[g.f2134 + 1];
                                        if (g.f2133 == g.f2131) {
                                            cArr3[g.f2134] = (char) (g.f2133 - b10);
                                            cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                                        } else {
                                            g.f2132 = g.f2133 / c10;
                                            g.f2130 = g.f2133 % c10;
                                            g.f2135 = g.f2131 / c10;
                                            g.f2128 = g.f2131 % c10;
                                            if (g.f2130 == g.f2128) {
                                                g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                                g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                                int i18 = (g.f2132 * c10) + g.f2130;
                                                int i19 = (g.f2135 * c10) + g.f2128;
                                                int i20 = g.f2134;
                                                cArr3[i20] = cArr2[i18];
                                                cArr3[i20 + 1] = cArr2[i19];
                                            } else if (g.f2132 == g.f2135) {
                                                g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                                g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                                int i21 = (g.f2132 * c10) + g.f2130;
                                                int i22 = (g.f2135 * c10) + g.f2128;
                                                int i23 = g.f2134;
                                                cArr3[i23] = cArr2[i21];
                                                cArr3[i23 + 1] = cArr2[i22];
                                            } else {
                                                int i24 = (g.f2132 * c10) + g.f2128;
                                                int i25 = (g.f2135 * c10) + g.f2130;
                                                int i26 = g.f2134;
                                                cArr3[i26] = cArr2[i24];
                                                cArr3[i26 + 1] = cArr2[i25];
                                            }
                                        }
                                        g.f2134 += 2;
                                    }
                                }
                                str2 = new String(cArr3);
                            }
                            return str2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.is
                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        public final List<WebView> mo1737(Object obj) {
                            List<WebView> list;
                            int i16 = f1452 + 121;
                            f1451 = i16 % 128;
                            try {
                                if ((i16 % 2 == 0 ? 'Q' : (char) 24) != 'Q') {
                                    list = (List) dsVarM1687.m2097(cq.m1666(cq.this), cq.this, Collections.singletonList(obj)).m2089();
                                } else {
                                    list = (List) dsVarM1687.m2097(cq.m1666(cq.this), cq.this, Collections.singletonList(obj)).m2089();
                                    int i17 = 55 / 0;
                                }
                                return list;
                            } catch (Exception unused) {
                                String strIntern = m1736("\u0001\u0002\u0003\u0004\u0000\u0002\u0006\u0007\b\t\u000e\t\u0000\u000b\u0006\u0010", 15 - Process.getGidForName(""), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m1736("\r\f\r\u0001\f\u000e\u000b\u0004ÐÐ\u0005\r\n\u000e\u0010\u0000\u0011\u0012\u0006\u0003\u0013\u0005\u0012\u0017\r\u0001\u0003\f", 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (91 - ImageFormat.getBitsPerPixel(0))).intern());
                                sb2.append(strM2024);
                                k.m2810(strIntern, sb2.toString());
                                return null;
                            }
                        }
                    };
                } else {
                    String strM1683 = m1683();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1660("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", 22 - Color.blue(0), (byte) (MotionEvent.axisFromString("") + 105)).intern());
                    sb2.append(strM2024);
                    sb2.append(m1659("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", (KeyEvent.getMaxKeyCode() >> 16) + 41443).intern());
                    co.m1623(strM1683, sb2.toString(), null);
                }
            }
            m1664(jSONObjectM1676, m1673(false), m1673(true), isVar);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1664(JSONObject jSONObject, l lVar, l lVar2, is isVar) {
        int i10 = f1397 + 59;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        this.f1398.m3059(jSONObject, m1651(lVar, lVar2), m1638(), isVar);
        int i12 = f1394 + 17;
        f1397 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1671(JSONObject jSONObject, p pVar, p pVar2) {
        int i10 = f1397 + 47;
        f1394 = i10 % 128;
        if ((i10 % 2 == 0 ? '#' : 'D') == '#') {
            this.f1398.m3061(jSONObject, m1674(pVar, pVar2));
            throw null;
        }
        this.f1398.m3061(jSONObject, m1674(pVar, pVar2));
        int i11 = f1394 + 5;
        f1397 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r4 = m1687(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        m1656(r0, r2, r1, new com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass10(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r0 = m1683();
        r1 = new java.lang.StringBuilder();
        r1.append(m1660("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", android.graphics.Color.green(0) + 22, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0) + 104)).intern());
        r1.append(r7);
        r1.append(m1659("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", 41443 - android.view.View.resolveSize(0, 0)).intern());
        com.ironsource.adqualitysdk.sdk.i.co.m1623(r0, r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        m1671(r0, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1663(com.ironsource.adqualitysdk.sdk.i.Cdo r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1397
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1394 = r1
            int r0 = r0 % 2
            org.json.JSONObject r0 = r7.m2025()
            org.json.JSONObject r0 = r6.m1676(r0)
            r1 = 30
            if (r0 == 0) goto L18
            r2 = r1
            goto L1a
        L18:
            r2 = 44
        L1a:
            if (r2 == r1) goto L1e
            goto Lae
        L1e:
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1394
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1397 = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            r1 = r3
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L44
            java.lang.String r7 = r7.m2026()
            com.ironsource.adqualitysdk.sdk.i.p r1 = r6.m1658(r2)
            com.ironsource.adqualitysdk.sdk.i.p r2 = r6.m1658(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto Lab
            goto L56
        L44:
            java.lang.String r7 = r7.m2026()
            com.ironsource.adqualitysdk.sdk.i.p r1 = r6.m1658(r2)
            com.ironsource.adqualitysdk.sdk.i.p r2 = r6.m1658(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto Lab
        L56:
            com.ironsource.adqualitysdk.sdk.i.ds r4 = r6.m1687(r7)
            if (r4 == 0) goto L65
            com.ironsource.adqualitysdk.sdk.i.cq$10 r7 = new com.ironsource.adqualitysdk.sdk.i.cq$10
            r7.<init>()
            r6.m1656(r0, r2, r1, r7)
            return
        L65:
            java.lang.String r0 = r6.m1683()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = android.graphics.Color.green(r3)
            int r2 = r2 + 22
            r4 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r4 = r4 + 104
            byte r4 = (byte) r4
            java.lang.String r5 = "\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016"
            java.lang.String r2 = m1660(r5, r2, r4)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r1.append(r7)
            r7 = 41443(0xa1e3, float:5.8074E-41)
            int r2 = android.view.View.resolveSize(r3, r3)
            int r7 = r7 - r2
            java.lang.String r2 = "옞枳薗⏣䆒\uef37ഃꭾ쥈皡"
            java.lang.String r7 = m1659(r2, r7)
            java.lang.String r7 = r7.intern()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 0
            com.ironsource.adqualitysdk.sdk.i.co.m1623(r0, r7, r1)
            return
        Lab:
            r6.m1671(r0, r2, r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m1663(com.ironsource.adqualitysdk.sdk.i.do):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if ((r6 != null) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((r6 != null ? 30 : 'V') != 30) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1397 + 99;
        com.ironsource.adqualitysdk.sdk.i.cq.f1394 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r6.getName();
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m1668(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1397
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1394 = r1
            int r0 = r0 % 2
            r1 = 40
            if (r0 != 0) goto L11
            r0 = 29
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 49201(0xc031, float:6.8945E-41)
            java.lang.String r3 = "옐٬䘰蛌욉ڸ"
            r4 = 0
            if (r0 == r1) goto L39
            com.ironsource.adqualitysdk.sdk.i.bd r0 = r5.m1693()
            int r1 = android.view.View.combineMeasuredStates(r4, r4)
            int r2 = r2 % r1
            java.lang.String r1 = m1659(r3, r2)
            java.lang.String r1 = r1.intern()
            java.lang.String r6 = com.ironsource.adqualitysdk.sdk.i.kc.m2864(r6, r1)
            java.lang.Class r6 = r0.m816(r6)
            if (r6 == 0) goto L36
            r4 = 1
        L36:
            if (r4 == 0) goto L5c
            goto L68
        L39:
            com.ironsource.adqualitysdk.sdk.i.bd r0 = r5.m1693()
            int r1 = android.view.View.combineMeasuredStates(r4, r4)
            int r2 = r2 - r1
            java.lang.String r1 = m1659(r3, r2)
            java.lang.String r1 = r1.intern()
            java.lang.String r6 = com.ironsource.adqualitysdk.sdk.i.kc.m2864(r6, r1)
            java.lang.Class r6 = r0.m816(r6)
            r0 = 30
            if (r6 == 0) goto L58
            r1 = r0
            goto L5a
        L58:
            r1 = 86
        L5a:
            if (r1 == r0) goto L68
        L5c:
            r6 = 0
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1397
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1394 = r1
            int r0 = r0 % 2
            return r6
        L68:
            java.lang.String r6 = r6.getName()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m1668(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1680(Cdo cdo) {
        List listMo485 = ar.m483().mo485();
        ISAdQualityAdType iSAdQualityAdTypeM2027 = cdo.m2027();
        if ((listMo485 != null ? (char) 2 : 'F') == 2) {
            int i10 = f1397 + 93;
            f1394 = i10 % 128;
            int i11 = i10 % 2;
            if (iSAdQualityAdTypeM2027 != ISAdQualityAdType.UNKNOWN) {
                int i12 = f1397 + 111;
                f1394 = i12 % 128;
                int i13 = i12 % 2;
                if ((!listMo485.contains(iSAdQualityAdTypeM2027) ? 'W' : '0') != '0') {
                    return true;
                }
                int i14 = f1394 + 123;
                f1397 = i14 % 128;
                if ((i14 % 2 != 0 ? 'P' : 'K') == 'K') {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private v m1667(final v vVar, final v vVar2) {
        int i10 = f1397 + 115;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        if (vVar == null) {
            vVar = new v();
        }
        if (vVar2 == null) {
            vVar2 = new v();
            int i12 = f1394 + 37;
            f1397 = i12 % 128;
            int i13 = i12 % 2;
        }
        return new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1703(JSONObject jSONObject, WebView webView, View view) {
                mo1703(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1706(JSONObject jSONObject, WebView webView, View view) {
                mo1706(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo262(JSONObject jSONObject, WebView webView, View view) {
                mo262(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1712(JSONObject jSONObject, WebView webView, View view) {
                mo1712(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo267(JSONObject jSONObject, WebView webView, View view) {
                mo267(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1704(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo1704(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo267(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo267(jSONObject, webView, view);
                t.m2991(new e.AnonymousClass3(vVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo1709(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo1709(jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1713(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo1713(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ */
            public final void mo262(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo262(jSONObject, webView, view);
                t.m2991(new a.AnonymousClass1(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1713(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo1713(jSONObject, webView, obj, view);
                t.m2991(new d.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ */
            public final void mo1704(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo1704(jSONObject, webView, obj, view);
                t.m2991(new b.AnonymousClass3(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1706(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo1706(jSONObject, webView, view);
                t.m2991(new c.AnonymousClass2(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1712(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo1712(jSONObject, webView, view);
                t.m2991(new f.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ */
            public final void mo1703(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo1703(jSONObject, webView, view);
                t.m2991(new h.AnonymousClass2(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1709(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo1709(jSONObject, webView, obj, view);
                t.m2991(new j.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }
        };
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m1694(String str, List<Object> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1660("&\u0007\u000b\u0018\u000f\u0000+\u001d\b\u0003\u0010\t\u0004\u000f\u0002&", 15 - ExpandableListView.getPackedPositionChild(0L), (byte) (Gravity.getAbsoluteGravity(0, 0) + 39)).intern());
        sb2.append(str);
        m1655(sb2.toString(), list);
        int i10 = f1397 + 25;
        f1394 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return;
        }
        int i11 = 42 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1648(JSONObject jSONObject, v vVar, v vVar2) {
        int i10 = f1394 + 3;
        f1397 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : ';') == '1') {
            this.f1398.m3064(jSONObject, m1667(vVar, vVar2));
            throw null;
        }
        this.f1398.m3064(jSONObject, m1667(vVar, vVar2));
        int i11 = f1394 + 15;
        f1397 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1645(String str, JSONObject jSONObject) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493) {
                    if ((str.equals(m1659("왈湒陑㹆", View.MeasureSpec.makeMeasureSpec(0, 0) + 43013).intern()) ? 'M' : ')') == 'M') {
                        int i10 = f1394 + 87;
                        f1397 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            } else if (str.equals(m1660("\u000b\u0000\t\n\u000b\b", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, (byte) (7 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                int i12 = f1394 + 9;
                f1397 = i12 % 128;
                b10 = i12 % 2 == 0 ? (byte) 2 : (byte) 5;
            }
        } else if (str.equals(m1660("\u0002\u0003\u0004\u0005\u0006\u0005\u0004\u0000", 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0') + 78)).intern())) {
            int i13 = f1397 + 51;
            f1394 = i13 % 128;
            b10 = i13 % 2 == 0 ? (byte) 1 : (byte) 0;
        }
        if (b10 == 0) {
            return jSONObject.optString(m1660("\u0002\b\u001e\t\u0004\u0005\u0006\u0005\u0004\u0000\u0016\u0003\u001b\u000b", 14 - TextUtils.indexOf("", "", 0, 0), (byte) View.resolveSize(0, 0)).intern(), null);
        }
        if (b10 == 1) {
            return jSONObject.optString(m1660("\u0002\b\u0019\u0005\u0007\b\u0015\u0014\u0004\u000f\u0011\u0019\u0004\u0016l", 14 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (7 - View.resolveSizeAndState(0, 0, 0))).intern(), null);
        }
        if (b10 != 2) {
            return null;
        }
        return jSONObject.optString(m1659("왈揾贉㚲僙﨟➩䇒\ueb05ᒁ뻅\ud810ַ", 42409 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jh m1672(final List<String> list) {
        jh jhVar = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.6

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f1458 = 5;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char[] f1459 = {'o', 'n', 'A', 'c', 't', 'i', 'v', 'y', 'C', 'r', 'e', 'a', 'd', 'S', 'P', 'u', 's', 'I', 'L', 'f', 'l', '.', 'p', 'q', 'w'};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1460 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1461 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1462 = -7895666258947269960L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1463;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1464;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m1739(String str, Activity activity) {
                int i10 = f1461 + 83;
                f1460 = i10 % 128;
                int i11 = i10 % 2;
                m1743(str, Collections.singletonList(activity));
                int i12 = f1460 + 63;
                f1461 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public static /* synthetic */ void m1742(AnonymousClass6 anonymousClass6, String str, List list2) {
                int i10 = f1460 + 87;
                f1461 = i10 % 128;
                if (i10 % 2 != 0) {
                }
                anonymousClass6.m1744(str, false, (List<Object>) list2);
                int i11 = f1461 + 63;
                f1460 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ｋ */
            public final void mo385(Activity activity) {
                int i10 = f1460 + 1;
                f1461 = i10 % 128;
                int i11 = i10 % 2;
                m1739(m1738("봝흇龃\ue27aヌ鹹䫛㠙䍮脋Ἧ䠀榯鿵\udd21⫖\uf639閡\ue871襾왴錏ℑ탩뢉", (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "᪸\uda69\uf55e鉬", (-1126885650) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\ued57픖펼˻").intern(), activity);
                int i12 = f1461 + 59;
                f1460 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m1738(String str, char c10, String str2, int i10, String str3) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str2;
                if (str2 != null) {
                    charArray2 = str2.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str;
                if (str != null) {
                    charArray3 = str.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2673) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i10));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    com.ironsource.adqualitysdk.sdk.i.j.f2675 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.j.f2675;
                        if (i11 < length) {
                            int i12 = (i11 + 2) % 4;
                            int i13 = (i11 + 3) % 4;
                            int i14 = cArr4[i11 % 4] * 32718;
                            char c11 = cArr5[i12];
                            char c12 = (char) ((i14 + c11) % 65535);
                            com.ironsource.adqualitysdk.sdk.i.j.f2674 = c12;
                            cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                            cArr4[i13] = c12;
                            int i15 = com.ironsource.adqualitysdk.sdk.i.j.f2675;
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1462) ^ ((long) f1464)) ^ ((long) f1463));
                            com.ironsource.adqualitysdk.sdk.i.j.f2675 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m1740(String str, Activity activity, Bundle bundle) {
                int i10 = f1460 + 93;
                f1461 = i10 % 128;
                int i11 = i10 % 2;
                m1743(str, Arrays.asList(activity, bundle));
                int i12 = f1460 + 63;
                f1461 = i12 % 128;
                if ((i12 % 2 != 0 ? 'C' : '.') != 'C') {
                    return;
                }
                int i13 = 39 / 0;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1741(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2129) {
                    char[] cArr2 = f1459;
                    char c10 = f1458;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        g.f2134 = 0;
                        while (true) {
                            int i11 = g.f2134;
                            if (i11 >= i10) {
                                break;
                            }
                            g.f2133 = cArr[i11];
                            g.f2131 = cArr[g.f2134 + 1];
                            if (g.f2133 == g.f2131) {
                                cArr3[g.f2134] = (char) (g.f2133 - b10);
                                cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                            } else {
                                g.f2132 = g.f2133 / c10;
                                g.f2130 = g.f2133 % c10;
                                g.f2135 = g.f2131 / c10;
                                g.f2128 = g.f2131 % c10;
                                if (g.f2130 == g.f2128) {
                                    g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                    g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                    int i12 = (g.f2132 * c10) + g.f2130;
                                    int i13 = (g.f2135 * c10) + g.f2128;
                                    int i14 = g.f2134;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (g.f2132 == g.f2135) {
                                    g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                    g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                    int i15 = (g.f2132 * c10) + g.f2130;
                                    int i16 = (g.f2135 * c10) + g.f2128;
                                    int i17 = g.f2134;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (g.f2132 * c10) + g.f2128;
                                    int i19 = (g.f2135 * c10) + g.f2130;
                                    int i20 = g.f2134;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            g.f2134 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1743(final String str, final List<Object> list2) {
                m1744(str, true, list2);
                t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.6.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        AnonymousClass6.m1742(AnonymousClass6.this, str, list2);
                    }
                });
                int i10 = f1460 + 95;
                f1461 = i10 % 128;
                if (i10 % 2 == 0) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (!(cq.m1679(activity, list))) {
                    return;
                }
                int i10 = f1461 + 95;
                f1460 = i10 % 128;
                int i11 = i10 % 2;
                m1740(m1741("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\t\u0005\u000b\f\u0000\u000e\u0092", 16 - TextUtils.lastIndexOf("", '0', 0), (byte) (46 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), activity, bundle);
                int i12 = f1460 + 73;
                f1461 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x003a  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i10 = f1461 + 89;
                f1460 = i10 % 128;
                if ((i10 % 2 == 0 ? (char) 16 : ',') != ',') {
                    int i11 = 64 / 0;
                    if ((cq.m1679(activity, list) ? '\"' : 'O') == '\"') {
                        m1739(m1738("◞ᑶ䲫髙⚴瑝尟按씌\uf679봨앒淙\ue6d9ꄖ坯⮝\uf29e汪", (char) (TextUtils.lastIndexOf("", '0') + 29985), "᪸\uda69\uf55e鉬", AndroidCharacter.getMirror('0') - 16671, "ᆂ悿⃣蝵").intern(), activity);
                    }
                } else {
                    if ((cq.m1679(activity, list) ? 'Y' : '?') != '?') {
                        m1739(m1738("◞ᑶ䲫髙⚴瑝尟按씌\uf679봨앒淙\ue6d9ꄖ坯⮝\uf29e汪", (char) (TextUtils.lastIndexOf("", '0') + 29985), "᪸\uda69\uf55e鉬", AndroidCharacter.getMirror('0') - 16671, "ᆂ悿⃣蝵").intern(), activity);
                    }
                }
                int i12 = f1460 + 111;
                f1461 = i12 % 128;
                if (i12 % 2 == 0) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int fadingEdgeLength;
                int iResolveSize;
                int i10 = f1461 + 47;
                f1460 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 27 / 0;
                    if (!cq.m1679(activity, list)) {
                        return;
                    }
                } else {
                    if (!cq.m1679(activity, list)) {
                        return;
                    }
                }
                int i12 = f1461 + 37;
                f1460 = i12 % 128;
                if (i12 % 2 == 0) {
                    fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() << 15) + 123;
                    iResolveSize = 87 >>> View.resolveSize(1, 0);
                } else {
                    fadingEdgeLength = 16 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    iResolveSize = 44 - View.resolveSize(0, 0);
                }
                m1739(m1741("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\n\f\u0010\u0011\u000b\r", fadingEdgeLength, (byte) iResolveSize).intern(), activity);
                int i13 = f1461 + 89;
                f1460 = i13 % 128;
                int i14 = i13 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0037  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i10 = f1460 + 19;
                f1461 = i10 % 128;
                if (i10 % 2 == 0) {
                    if ((cq.m1679(activity, list) ? 'U' : 'E') == 'U') {
                        m1739(m1738("騮\ue0e4陑칳ଔ\u171c䒍젠◉吠ꟊ敖뉵靬\ue732Ꝑ䘬", (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 58341), "᪸\uda69\uf55e鉬", View.MeasureSpec.makeMeasureSpec(0, 0) - 1081474287, "ᄀ訃\ue5bf口").intern(), activity);
                    }
                } else {
                    int i11 = 94 / 0;
                    if ((cq.m1679(activity, list) ? (char) 22 : (char) 26) == 22) {
                        m1739(m1738("騮\ue0e4陑칳ଔ\u171c䒍젠◉吠ꟊ敖뉵靬\ue732Ꝑ䘬", (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 58341), "᪸\uda69\uf55e鉬", View.MeasureSpec.makeMeasureSpec(0, 0) - 1081474287, "ᄀ訃\ue5bf口").intern(), activity);
                    }
                }
                int i12 = f1460 + 67;
                f1461 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i10 = f1460 + 79;
                f1461 = i10 % 128;
                int i11 = i10 % 2;
                if (cq.m1679(activity, list)) {
                    int i12 = f1460 + 93;
                    f1461 = i12 % 128;
                    int i13 = i12 % 2;
                    m1740(m1741("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000e\f\u0005\u000b\u0010\u0002\u0013\u0001\u0010\u0006\u0000\r\u000e\u0003\u000e\u0001à", 27 - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 123)).intern(), activity, bundle);
                    int i14 = f1461 + 119;
                    f1460 = i14 % 128;
                    int i15 = i14 % 2;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i10 = f1461 + 5;
                f1460 = i10 % 128;
                int i11 = i10 % 2;
                if (cq.m1679(activity, list)) {
                    int i12 = f1461 + 53;
                    f1460 = i12 % 128;
                    int i13 = i12 % 2;
                    m1739(m1741("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000e\u0003\u000e\u0006\u0000\u000e\u0090", View.combineMeasuredStates(0, 0) + 17, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 44)).intern(), activity);
                }
                int i14 = f1460 + 55;
                f1461 = i14 % 128;
                int i15 = i14 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0035  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                int i10 = f1460 + 83;
                f1461 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    int i11 = 88 / 0;
                    if ((cq.m1679(activity, list) ? (char) 31 : '<') == 31) {
                        m1739(m1738("溮쯏봉㜣⫑\udbcc鸩鳣╾ﾁ睏\uebae\uf425\uf648\udf19᠙Ꝉ", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7996), "᪸\uda69\uf55e鉬", 1332154649 - MotionEvent.axisFromString(""), "᪴朑㵏縟").intern(), activity);
                    }
                } else {
                    if (!(cq.m1679(activity, list) ? false : true)) {
                        m1739(m1738("溮쯏봉㜣⫑\udbcc鸩鳣╾ﾁ睏\uebae\uf425\uf648\udf19᠙Ꝉ", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7996), "᪸\uda69\uf55e鉬", 1332154649 - MotionEvent.axisFromString(""), "᪴朑㵏縟").intern(), activity);
                    }
                }
                int i12 = f1460 + 95;
                f1461 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻐ */
            public final void mo384(Activity activity) {
                char c10;
                int jumpTapTimeout;
                int i10 = f1461 + 67;
                f1460 = i10 % 128;
                if (i10 % 2 != 0) {
                    c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                } else {
                    c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() - 90;
                }
                m1739(m1738("魭饝੪㖗4隸舙쩐澲馘\ue92b躪\ue7cb៤軘遼ₐ䓌괰ᮠ蠷", c10, "᪸\uda69\uf55e鉬", (-192277445) - jumpTapTimeout, "㮢訔ᓴ洴").intern(), activity);
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1744(String str, boolean z10, List<Object> list2) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1741("\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000f\b\u000f\u000e\u0002\b\u0000\u0017\u000b\u0014", TextUtils.getOffsetBefore("", 0) + 18, (byte) (34 - TextUtils.indexOf("", "", 0))).intern());
                sb2.append(str);
                cq.m1652(cqVar, sb2.toString(), z10, false, list2);
                int i10 = f1461 + 83;
                f1460 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    return;
                }
                int i11 = 36 / 0;
            }
        };
        int i10 = f1394 + 65;
        f1397 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jhVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m1676(JSONObject jSONObject) {
        dp dpVarM1643;
        int i10 = f1394 + 77;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = jSONObject.optString(m1660(" \u000e$\u001d\u0007\r\u0002 ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) (88 - TextUtils.indexOf("", ""))).intern());
        jSONObject.remove(m1660(" \u000e$\u001d\u0007\r\u0002 ", AndroidCharacter.getMirror('0') - '(', (byte) (88 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern());
        if ((jSONObject.optBoolean(m1659("왗珗굚\ue6ce၁䷩蝞ー", 46471 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? 'E' : 'M') == 'E' && (dpVarM1643 = m1643()) != null) {
            if (!TextUtils.isEmpty(dpVarM1643.m2035())) {
                jSONObject.remove(m1659("왗珗굚\ue6ce၁䷩蝞ー", TextUtils.indexOf((CharSequence) "", '0') + 46472).intern());
                try {
                    String strIntern = m1660(" \u000e&\u0011\u001d\u000b\"\u0007\u0003\u0004", 10 - Color.red(0), (byte) (60 - Color.green(0))).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    sb2.append(dpVarM1643.m2035());
                    jSONObject.put(strIntern, sb2.toString());
                } catch (JSONException unused) {
                }
            }
            if (dpVarM1643.m2033()) {
                int i12 = f1397 + 61;
                f1394 = i12 % 128;
                try {
                    if (i12 % 2 == 0) {
                        jSONObject.put(m1660("\u0012\u0013\f\"\u001f\u0002\u001d\b \u0014", 127 / TextUtils.getTrimmedLength(""), (byte) (2 % KeyEvent.normalizeMetaState(1))).intern(), false);
                    } else {
                        jSONObject.put(m1660("\u0012\u0013\f\"\u001f\u0002\u001d\b \u0014", 10 - TextUtils.getTrimmedLength(""), (byte) (82 - KeyEvent.normalizeMetaState(0))).intern(), true);
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        do {
            if (!itKeys.hasNext()) {
                return jSONObject;
            }
        } while ((!m1649(jSONObject, itKeys.next()) ? '>' : '1') != '>');
        int i13 = f1394 + 39;
        f1397 = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1656(JSONObject jSONObject, p pVar, p pVar2, it itVar) {
        int i10 = f1394 + 41;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        this.f1398.m3063(jSONObject, m1674(pVar, pVar2), itVar);
        int i12 = f1397 + 67;
        f1394 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            int i13 = 83 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0013 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m1661(List<String> list) {
        String next;
        String strM1668;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        int i10 = f1394 + 35;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if (!it.hasNext()) {
                return arrayList;
            }
            int i12 = f1397 + 65;
            f1394 = i12 % 128;
            if (i12 % 2 != 0) {
                next = it.next();
                if (m1665(next)) {
                    strM1668 = m1668(next);
                    if (strM1668 != null) {
                        arrayList.add(strM1668);
                    }
                } else {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                int i13 = 31 / 0;
                if (m1665(next)) {
                    strM1668 = m1668(next);
                    if (strM1668 != null) {
                        arrayList.add(strM1668);
                    }
                } else {
                    arrayList.add(next);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m1657(Activity activity, List<String> list) {
        int i10 = f1397 + 109;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        if ((!list.isEmpty() ? '@' : 'A') == 'A' || list.contains(activity.getClass().getName())) {
            return true;
        }
        int i12 = f1394 + 13;
        f1397 = i12 % 128;
        if ((i12 % 2 != 0 ? ',' : 'O') != ',') {
            return false;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private l m1651(final l lVar, final l lVar2) {
        int i10 = f1394 + 77;
        f1397 = i10 % 128;
        if ((i10 % 2 != 0 ? ';' : '[') == ';') {
            int i11 = 27 / 0;
            if (lVar == null) {
                lVar = new l();
                int i12 = f1394 + 7;
                f1397 = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (lVar == null) {
            lVar = new l();
            int i14 = f1394 + 7;
            f1397 = i14 % 128;
            int i15 = i14 % 2;
        }
        if (lVar2 == null) {
            lVar2 = new l();
        }
        return new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.13
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1703(JSONObject jSONObject, WebView webView, Activity activity) {
                mo1703(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1706(JSONObject jSONObject, WebView webView, Activity activity) {
                mo1706(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo262(JSONObject jSONObject, WebView webView, Activity activity) {
                mo262(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1712(JSONObject jSONObject, WebView webView, Activity activity) {
                mo1712(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo267(JSONObject jSONObject, WebView webView, Activity activity) {
                mo267(jSONObject, webView, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1704(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo1704(jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ */
            public final void mo267(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo267(jSONObject, webView, activity);
                t.m2991(new e.AnonymousClass3(lVar, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo1709(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo1709(jSONObject, webView, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1713(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                mo1713(jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ */
            public final void mo262(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo262(jSONObject, webView, activity);
                t.m2991(new a.AnonymousClass1(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1712(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo1712(jSONObject, webView, activity);
                t.m2991(new f.AnonymousClass4(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ */
            public final void mo1703(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo1703(jSONObject, webView, activity);
                t.m2991(new h.AnonymousClass2(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1704(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo1704(jSONObject, webView, obj, activity);
                t.m2991(new b.AnonymousClass3(lVar, jSONObject, webView, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1713(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo1713(jSONObject, webView, obj, activity);
                t.m2991(new d.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ */
            public final void mo1709(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo1709(jSONObject, webView, obj, activity);
                t.m2991(new j.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1706(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo1706(jSONObject, webView, activity);
                t.m2991(new c.AnonymousClass2(lVar, jSONObject, webView, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m1649(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        try {
            if ((objOpt instanceof String ? (char) 21 : (char) 22) != 22) {
                int i10 = f1394 + 97;
                f1397 = i10 % 128;
                int i11 = i10 % 2;
                String str2 = (String) objOpt;
                if ((m1665(str2) ? 'Y' : '_') == '_') {
                    return true;
                }
                String strM1668 = m1668(str2);
                if ((strM1668 != null ? '3' : '-') != '-') {
                    int i12 = f1397 + 125;
                    f1394 = i12 % 128;
                    int i13 = i12 % 2;
                    jSONObject.put(str, strM1668);
                } else {
                    String strM1683 = m1683();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1659("왽䚭잡䒰얱䋥", 33023 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                    sb2.append(str2);
                    sb2.append(m1659("옞㿩㔣⭡\u20fa⛅ᰇቄ\u0b98Ǜܤ糠犲栺湂枆巜匃䥕仫䐭먳뎴꧈꼕ꕛ骑郓陧边薰שׁ\uf17b\uf693\uecd9\ue205", 63929 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                    co.m1626(strM1683, sb2.toString());
                    return false;
                }
            } else {
                if (!(objOpt instanceof JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new JSONArray((Collection) m1661(jz.m2790((JSONArray) objOpt))));
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jm m1650(final List<String> list) {
        jm jmVar = new jm() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1408 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1409 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1410 = -6294769124750872179L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m1698(String str, final Activity activity, List<String> list2) {
                int i10 = f1408 + 45;
                f1409 = i10 % 128;
                if ((i10 % 2 != 0 ? (char) 5 : ';') == 5) {
                    cq.m1679(activity, list2);
                    throw null;
                }
                if (cq.m1679(activity, list2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1697("鹯鸮䋸審\uf305㢃屉䢨場㕚狒鈀ቋ罤되\ue9d3첖䚿\uee3a⾙蚑", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
                    sb2.append(str);
                    final String string = sb2.toString();
                    cq.m1652(cq.this, string, true, false, Collections.singletonList(activity));
                    t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            cq.m1652(cq.this, string, false, false, Collections.singletonList(activity));
                        }
                    });
                }
                int i11 = f1409 + 61;
                f1408 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ｋ */
            public final void mo380(Activity activity) {
                int i10 = f1408 + 1;
                f1409 = i10 % 128;
                m1698((i10 % 2 == 0 ? m1697("\uea72\uea1d᩵ￏꮖ鲓퉥욭Ⱕ淁훲\u1c3a晵⟳္", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))) : m1697("\uea72\uea1d᩵ￏꮖ鲓퉥욭Ⱕ淁훲\u1c3a晵⟳္", (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)) * 0)).intern(), activity, list);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ﾇ */
            public final void mo381(Activity activity) {
                int i10 = f1409 + 11;
                f1408 = i10 % 128;
                int i11 = i10 % 2;
                m1698(m1697("\ud90c\ud963\uf69a쨿䝹ꥣ㺷⩿Ὓ脮\ue302\uf0f6唁쬜◉謟询\uf2d6翭", 1 - (Process.myPid() >> 22)).intern(), activity, list);
                int i12 = f1409 + 103;
                f1408 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m1697(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2284) {
                    char[] cArrM2243 = com.ironsource.adqualitysdk.sdk.i.h.m2243(f1410, cArr, i10);
                    com.ironsource.adqualitysdk.sdk.i.h.f2285 = 4;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.h.f2285;
                        if (i11 < cArrM2243.length) {
                            com.ironsource.adqualitysdk.sdk.i.h.f2283 = i11 - 4;
                            int i12 = com.ironsource.adqualitysdk.sdk.i.h.f2285;
                            cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) com.ironsource.adqualitysdk.sdk.i.h.f2283) * f1410));
                            com.ironsource.adqualitysdk.sdk.i.h.f2285++;
                        } else {
                            str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                        }
                    }
                }
                return str2;
            }
        };
        int i10 = f1394 + 101;
        f1397 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return jmVar;
        }
        int i11 = 16 / 0;
        return jmVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1655(final String str, final List<Object> list) {
        t.m2991(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cq.m1652(cq.this, str, false, false, list);
            }
        });
        t.m3000(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cq.m1652(cq.this, str, true, false, list);
            }
        });
        m1654(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cq.m1652(cq.this, str, false, true, list);
            }
        }, true);
        int i10 = f1394 + 29;
        f1397 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r4 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.t.m2993(new com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass7());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.t.m2995(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.cq.f1394 + 123;
        com.ironsource.adqualitysdk.sdk.i.cq.f1397 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 != false) goto L12;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1654(final com.ironsource.adqualitysdk.sdk.i.im r3, boolean r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1397
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1394 = r1
            int r0 = r0 % 2
            r1 = 50
            if (r0 != 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 82
        L12:
            if (r0 == r1) goto L17
            if (r4 == 0) goto L26
            goto L1d
        L17:
            r0 = 85
            int r0 = r0 / 0
            if (r4 == 0) goto L26
        L1d:
            com.ironsource.adqualitysdk.sdk.i.cq$7 r4 = new com.ironsource.adqualitysdk.sdk.i.cq$7     // Catch: java.lang.Throwable -> L33
            r4.<init>()     // Catch: java.lang.Throwable -> L33
            com.ironsource.adqualitysdk.sdk.i.t.m2993(r4)     // Catch: java.lang.Throwable -> L33
            return
        L26:
            com.ironsource.adqualitysdk.sdk.i.t.m2995(r3)     // Catch: java.lang.Throwable -> L33
            int r3 = com.ironsource.adqualitysdk.sdk.i.cq.f1394
            int r3 = r3 + 123
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1397 = r4
            int r3 = r3 % 2
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m1654(com.ironsource.adqualitysdk.sdk.i.im, boolean):void");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1665(String str) {
        int i10 = f1394 + 95;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        boolean zEndsWith = str.endsWith(m1659("옐٬䘰蛌욉ڸ", View.getDefaultSize(0, 0) + 49201).intern());
        int i12 = f1397 + 3;
        f1394 = i12 % 128;
        int i13 = i12 % 2;
        return zEndsWith;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private l m1673(final boolean z10) {
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.11

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f1418 = -3526982931227970902L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1419 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1420 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* synthetic */ void mo1703(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1419 + 123;
                f1420 = i10 % 128;
                int i11 = i10 % 2;
                mo1703(jSONObject, webView, activity);
                int i12 = f1420 + 13;
                f1419 = i12 % 128;
                if ((i12 % 2 != 0 ? 'D' : 'C') != 'D') {
                    return;
                }
                int i13 = 42 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ void mo1706(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1420 + 93;
                f1419 = i10 % 128;
                int i11 = i10 % 2;
                mo1706(jSONObject, webView, activity);
                int i12 = f1420 + 89;
                f1419 = i12 % 128;
                if ((i12 % 2 != 0 ? 'L' : (char) 20) != 'L') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo262(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1419 + 101;
                f1420 = i10 % 128;
                int i11 = i10 % 2;
                mo262(jSONObject, webView, activity);
                int i12 = f1420 + 67;
                f1419 = i12 % 128;
                if ((i12 % 2 != 0 ? 'O' : (char) 27) != 'O') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo1712(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1419 + 79;
                f1420 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo1712(jSONObject, webView, activity);
                if (!z11) {
                    throw null;
                }
                int i11 = f1420 + 55;
                f1419 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo267(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1419 + 55;
                f1420 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo267(jSONObject, webView, activity);
                if (z11) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* synthetic */ void mo1704(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1420 + 75;
                f1419 = i10 % 128;
                int i11 = i10 % 2;
                mo1704(jSONObject, webView, obj, activity);
                int i12 = f1420 + 119;
                f1419 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo267(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1420 + 13;
                f1419 = i10 % 128;
                m1700(m1701("狋方尀㒦⼅މ︌횊쥫ꇠ顨烲歆䏕㩚ⴲ", (i10 % 2 != 0 ? '+' : 'I') != '+' ? 6007 - (ViewConfiguration.getWindowTouchSlop() >> 8) : (ViewConfiguration.getWindowTouchSlop() * 37) + 20166).intern(), jSONObject, webView, null, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ void mo1709(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1419 + 43;
                f1420 = i10 % 128;
                int i11 = i10 % 2;
                mo1709(jSONObject, webView, obj, activity);
                int i12 = f1419 + 47;
                f1420 = i12 % 128;
                if (!(i12 % 2 == 0)) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo1713(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1419 + 35;
                f1420 = i10 % 128;
                int i11 = i10 % 2;
                mo1713(jSONObject, webView, obj, activity);
                int i12 = f1419 + 87;
                f1420 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo262(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1419 + 73;
                f1420 = i10 % 128;
                m1700(m1701("狋솹᐀梦뼅\uf389䘌骊\ue96b㷠灨", (i10 % 2 == 0 ? (char) 26 : (char) 23) != 26 ? MotionEvent.axisFromString("") + 45944 : 45944 >>> MotionEvent.axisFromString("")).intern(), jSONObject, webView, null, activity);
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m1700(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1701("狫壚⛸\u0cfa\uda90ꂜ躬呖≳ࡥ환밒訽倩㿅י폿릛蟒", 10770 - MotionEvent.axisFromString("")).intern());
                sb2.append(str);
                cq.m1652(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i10 = f1420 + 83;
                f1419 = i10 % 128;
                if ((i10 % 2 != 0 ? ',' : (char) 11) == 11) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1712(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1419 + 47;
                f1420 = i10 % 128;
                m1700((!(i10 % 2 == 0) ? m1701("狉\ud966▫燵\udc21⡚璹샓⼇筅쟤", 43961 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)) : m1701("狉\ud966▫燵\udc21⡚璹샓⼇筅쟤", 43961 >>> (ViewConfiguration.getScrollBarFadeDuration() >>> 19))).intern(), jSONObject, webView, null, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1703(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1420 + 19;
                f1419 = i10 % 128;
                m1700(m1701("狜赪趝谦豏貓輨轔辁踳蹕躍", !(i10 % 2 == 0) ? 65448 / ((byte) KeyEvent.getModifierMetaStateMask()) : 65448 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), jSONObject, webView, null, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1704(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1419 + 69;
                f1420 = i10 % 128;
                int i11 = i10 % 2;
                m1700(m1701("狋\uda33⌓蠱턷㸸蜯\uec24㔦舉\ueb3a〚餛\ue639伏", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43261).intern(), jSONObject, webView, obj, activity);
                int i12 = f1419 + 69;
                f1420 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 5 : (char) 17) != 5) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1713(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1420 + 65;
                f1419 = i10 % 128;
                m1700((!(i10 % 2 != 0) ? m1701("狋엧\u1cbb垽깧\ue104㠷烐쮆", 46889 - ExpandableListView.getPackedPositionType(0L)) : m1701("狋엧\u1cbb垽깧\ue104㠷烐쮆", 46889 >>> ExpandableListView.getPackedPositionType(0L))).intern(), jSONObject, webView, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1709(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1420 + 79;
                f1419 = i10 % 128;
                int i11 = i10 % 2;
                m1700(m1701("狝⸘쭦摬ƞꋫ忏ﬦ鑷ㅦ튠迾⣛쐯愜ɶ뾬墈\uf5da鄫", TextUtils.lastIndexOf("", '0') + 23768).intern(), jSONObject, webView, obj, activity);
                int i12 = f1420 + 71;
                f1419 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1706(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1420 + 67;
                f1419 = i10 % 128;
                m1700(m1701("狋ꤥ씿\ue107ᵩ㥎啍熣", (i10 % 2 != 0 ? ':' : '&') != '&' ? (KeyEvent.getMaxKeyCode() << 120) * 56299 : (KeyEvent.getMaxKeyCode() >> 16) + 56299).intern(), jSONObject, webView, null, activity);
                int i11 = f1419 + 45;
                f1420 = i11 % 128;
                if (i11 % 2 != 0) {
                } else {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1701(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2019) {
                    com.ironsource.adqualitysdk.sdk.i.f.f2017 = i10;
                    char[] cArr2 = new char[cArr.length];
                    com.ironsource.adqualitysdk.sdk.i.f.f2018 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2018;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2017 * i11))) ^ f1418);
                            com.ironsource.adqualitysdk.sdk.i.f.f2018++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }
        };
        int i10 = f1394 + 47;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        return lVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private p m1658(final boolean z10) {
        p pVar = new p() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.14

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1431 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1432 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1433 = 181509955685428323L;

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1703(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1432 + 125;
                f1431 = i10 % 128;
                int i11 = i10 % 2;
                mo1703(jSONObject, view, activity);
                int i12 = f1432 + 29;
                f1431 = i12 % 128;
                if ((i12 % 2 != 0 ? (char) 18 : '\n') == '\n') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1706(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1432 + 19;
                f1431 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo1706(jSONObject, view, activity);
                if (z11) {
                    throw null;
                }
                int i11 = f1431 + 87;
                f1432 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo262(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1432 + 117;
                f1431 = i10 % 128;
                char c10 = i10 % 2 != 0 ? '/' : (char) 26;
                mo262(jSONObject, view, activity);
                if (c10 == '/') {
                    throw null;
                }
                int i11 = f1432 + 83;
                f1431 = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                int i12 = 97 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1712(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1432 + 47;
                f1431 = i10 % 128;
                boolean z11 = i10 % 2 == 0;
                mo1712(jSONObject, view, activity);
                if (!z11) {
                    throw null;
                }
                int i11 = f1432 + 17;
                f1431 = i11 % 128;
                if ((i11 % 2 != 0 ? (char) 20 : ')') != 20) {
                    return;
                }
                int i12 = 79 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo267(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1431 + 13;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
                mo267(jSONObject, view, activity);
                int i12 = f1432 + 69;
                f1431 = i12 % 128;
                if ((i12 % 2 != 0 ? '%' : 'T') != '%') {
                    return;
                }
                int i13 = 92 / 0;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1704(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1432 + 67;
                f1431 = i10 % 128;
                char c10 = i10 % 2 != 0 ? (char) 0 : '@';
                mo1704(jSONObject, view, obj, activity);
                if (c10 != 0) {
                    return;
                }
                int i11 = 53 / 0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo1703(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1431 + 121;
                f1432 = i10 % 128;
                m1726(m1727("ꞃ멹Ꟶᙳ‴碗遹锧ᙎ\ue7e2犱⚭쓸땪쌬\uf85c", i10 % 2 != 0 ? 1 - TextUtils.getCapsMode("", 0, 0) : 0 % TextUtils.getCapsMode("", 0, 1)).intern(), jSONObject, view, null, activity);
                int i11 = f1432 + 81;
                f1431 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo1709(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1432 + 41;
                f1431 = i10 % 128;
                boolean z11 = i10 % 2 != 0;
                mo1709(jSONObject, view, obj, activity);
                if (z11) {
                    int i11 = 16 / 0;
                }
                int i12 = f1431 + 55;
                f1432 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 11 : (char) 28) != 28) {
                    int i13 = 83 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1713(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1431 + 95;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
                mo1713(jSONObject, view, obj, activity);
                int i12 = f1431 + 119;
                f1432 = i12 % 128;
                if ((i12 % 2 == 0 ? 'J' : '\\') != 'J') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1713(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1432 + 65;
                f1431 = i10 % 128;
                int i11 = i10 % 2;
                m1726(m1727("黂ꢮ麣ҩ杧㿢ꐀꅅ⼧\uf522㗛ዐﶾ", AndroidCharacter.getMirror('0') - '/').intern(), jSONObject, view, obj, activity);
                int i12 = f1431 + 123;
                f1432 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo267(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1431 + 95;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
                m1726(m1727("븺\u007f빛걸瑸⳺꧊겊࿅巠⛄\u1f1e\udd5bཡ靀쇎ꫦ섌䇢끦", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), jSONObject, view, null, activity);
                int i12 = f1432 + 9;
                f1431 = i12 % 128;
                if (i12 % 2 == 0) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo1709(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1431 + 23;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
                m1726(m1727("\uef0e誑\uef79⚗걝\uf4f9ʰߚ廪휌ﻄ둨豳薩佋檘\ufbcf䯸駧ᬸ⥈\uf867\uea61증", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, view, obj, activity);
                int i12 = f1432 + 107;
                f1431 = i12 % 128;
                if (!(i12 % 2 != 0)) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1712(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1431 + 11;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
                m1726(m1727("ᩬ沃ᨏ삕偛࣮㈥㝸ꮏ\u3101˹蓦礑掖덄", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), jSONObject, view, null, activity);
                int i12 = f1432 + 73;
                f1431 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo262(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1431 + 15;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
                m1726(m1727("诶ø讗곿ᤧ䆥ᑾᄾ㨉嵧䮛ꊪ\ue897\u0fe6﨟", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jSONObject, view, null, activity);
                int i12 = f1431 + 29;
                f1432 = i12 % 128;
                if (i12 % 2 != 0) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1706(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1432 + 89;
                f1431 = i10 % 128;
                m1726(m1727("컸蝥캙⭢ꖨﴭ\u218dⓈ缛\udaf9\uf71a靜", (i10 % 2 != 0 ? 'R' : 'F') != 'F' ? 0 % (ViewConfiguration.getScrollDefaultDelay() << 9) : (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern(), jSONObject, view, null, activity);
                int i11 = f1431 + 61;
                f1432 = i11 % 128;
                int i12 = i11 % 2;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1726(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1727("땗ဖ딁발엫鵈ᕺဤҚ䶝靖ꎦ혼Ἑ⛳絕ꆖ텣\uf00c", 1 - View.MeasureSpec.getMode(0)).intern());
                sb2.append(str);
                cq.m1652(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, view, obj, activity));
                int i10 = f1431 + 59;
                f1432 = i10 % 128;
                int i11 = i10 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1704(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1432 + 55;
                f1431 = i10 % 128;
                int i11 = i10 % 2;
                m1726(m1727("翽퍳羜罴䳮ᑫ癷猲츘軿Ṓ삧ᲁ\udc4e꿇ṙ欴ሾ祲", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                int i12 = f1431 + 73;
                f1432 = i12 % 128;
                if ((i12 % 2 == 0 ? '2' : 'K') != '2') {
                } else {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1727(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2284) {
                    char[] cArrM2243 = com.ironsource.adqualitysdk.sdk.i.h.m2243(f1433, cArr, i10);
                    com.ironsource.adqualitysdk.sdk.i.h.f2285 = 4;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.h.f2285;
                        if (i11 < cArrM2243.length) {
                            com.ironsource.adqualitysdk.sdk.i.h.f2283 = i11 - 4;
                            int i12 = com.ironsource.adqualitysdk.sdk.i.h.f2285;
                            cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) com.ironsource.adqualitysdk.sdk.i.h.f2283) * f1433));
                            com.ironsource.adqualitysdk.sdk.i.h.f2285++;
                        } else {
                            str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                        }
                    }
                }
                return str2;
            }
        };
        int i10 = f1397 + 123;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        return pVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private p m1674(final p pVar, final p pVar2) {
        int i10 = f1394 + 81;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        if (pVar == null) {
            pVar = new p();
            int i12 = f1397 + 91;
            f1394 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (pVar2 == null) {
            pVar2 = new p();
            int i14 = f1397 + 27;
            f1394 = i14 % 128;
            int i15 = i14 % 2;
        }
        return new p() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.18
            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1703(JSONObject jSONObject, View view, Activity activity) {
                mo1703(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1706(JSONObject jSONObject, View view, Activity activity) {
                mo1706(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo262(JSONObject jSONObject, View view, Activity activity) {
                mo262(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1712(JSONObject jSONObject, View view, Activity activity) {
                mo1712(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo267(JSONObject jSONObject, View view, Activity activity) {
                mo267(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1704(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo1704(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo1703(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo1703(jSONObject, view, activity);
                t.m2991(new h.AnonymousClass2(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo1709(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo1709(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1713(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo1713(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1713(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo1713(jSONObject, view, obj, activity);
                t.m2991(new d.AnonymousClass2(pVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final void mo267(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo267(jSONObject, view, activity);
                t.m2991(new e.AnonymousClass3(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final void mo1712(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo1712(jSONObject, view, activity);
                t.m2991(new f.AnonymousClass4(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo262(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo262(jSONObject, view, activity);
                t.m2991(new a.AnonymousClass1(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo1709(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo1709(jSONObject, view, obj, activity);
                t.m2991(new j.AnonymousClass2(pVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1706(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo1706(jSONObject, view, activity);
                t.m2991(new c.AnonymousClass2(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1704(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo1704(jSONObject, view, obj, activity);
                t.m2991(new b.AnonymousClass3(pVar, jSONObject, view, obj, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1692(String str, JSONObject jSONObject) {
        if (str.equals(m1660("\u0002\b%\n\u000b\u0019\u0010\u000f\u0002\u0000\u0007\n", ExpandableListView.getPackedPositionType(0L) + 12, (byte) (ExpandableListView.getPackedPositionType(0L) + 108)).intern())) {
            this.f1399.m1600().m761(jSONObject);
        } else if (str.equals(m1659("왟黍睏쾘ꐎ粢헇ꩺˢ", TextUtils.lastIndexOf("", '0', 0) + 22680).intern())) {
            this.f1399.m1600().m767(jSONObject);
        }
        JSONObject jSONObjectM2794 = jz.m2794(m1662(jSONObject));
        if (str.equals(ih.f2502)) {
            this.f1399.m1600().m769(jSONObjectM2794);
            return;
        }
        if (str.equals(ih.f2503)) {
            this.f1399.m1600().m762(jSONObjectM2794);
            int i10 = f1397 + 69;
            f1394 = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        if ((str.equals(ih.f2509) ? 'X' : (char) 14) != 'X') {
            if ((str.equals(ih.f2508) ? '$' : '.') != '.') {
                this.f1399.m1600().m758(jSONObjectM2794);
                return;
            }
            if (str.equals(ih.f2501)) {
                this.f1399.m1600().m757(jSONObjectM2794);
                return;
            }
            if (str.equals(ih.f2504)) {
                int i12 = f1394 + 39;
                f1397 = i12 % 128;
                if (i12 % 2 == 0) {
                    this.f1399.m1600().m759(jSONObjectM2794);
                    return;
                } else {
                    this.f1399.m1600().m759(jSONObjectM2794);
                    int i13 = 52 / 0;
                    return;
                }
            }
            if (str.equals(ih.f2500)) {
                this.f1399.m1600().m756(jSONObjectM2794);
                return;
            } else {
                this.f1399.m1600().m765(str, jSONObject);
                return;
            }
        }
        this.f1399.m1600().m766(jSONObjectM2794);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private v m1644(final boolean z10) {
        v vVar = new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.12

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1423 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1424 = -343192624284133648L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1425;

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1703(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 23;
                f1425 = i10 % 128;
                char c10 = i10 % 2 != 0 ? '\b' : (char) 30;
                mo1703(jSONObject, webView, view);
                if (c10 != '\b') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1706(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 105;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
                mo1706(jSONObject, webView, view);
                int i12 = f1423 + 101;
                f1425 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo262(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1425 + 97;
                f1423 = i10 % 128;
                int i11 = i10 % 2;
                mo262(jSONObject, webView, view);
                int i12 = f1425 + 53;
                f1423 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1712(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1425 + 117;
                f1423 = i10 % 128;
                boolean z11 = i10 % 2 == 0;
                mo1712(jSONObject, webView, view);
                if (!z11) {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo267(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 115;
                f1425 = i10 % 128;
                char c10 = i10 % 2 != 0 ? '8' : G5.T;
                mo267(jSONObject, webView, view);
                if (c10 != '8') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo1704(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1423 + 81;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
                mo1704(jSONObject, webView, obj, view);
                int i12 = f1423 + 13;
                f1425 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo267(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1425 + 117;
                f1423 = i10 % 128;
                m1717((!(i10 % 2 != 0) ? m1716("隑㰕쎶椚㲇숅榚㼖슁栜㾞씾梄㸉얌欞", 43650 << (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))) : m1716("隑㰕쎶椚㲇숅榚㼖슁栜㾞씾梄㸉얌欞", 43650 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), jSONObject, webView, null, view);
                int i11 = f1423 + 23;
                f1425 = i11 % 128;
                if ((i11 % 2 != 0 ? 'U' : (char) 23) != 'U') {
                } else {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo1709(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1425 + 79;
                f1423 = i10 % 128;
                int i11 = i10 % 2;
                mo1709(jSONObject, webView, obj, view);
                int i12 = f1423 + 85;
                f1425 = i12 % 128;
                if ((i12 % 2 != 0 ? (char) 20 : (char) 5) != 5) {
                    int i13 = 10 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1713(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1425 + 89;
                f1423 = i10 % 128;
                char c10 = i10 % 2 == 0 ? (char) 5 : '!';
                mo1713(jSONObject, webView, obj, view);
                if (c10 != 5) {
                    return;
                }
                int i11 = 94 / 0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo262(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 47;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
                m1717(m1716("隑ᐥ鏖Ẋ鱇\u1bf5蚺ц茁ຬ豾", TextUtils.indexOf((CharSequence) "", '0') + 33458).intern(), jSONObject, webView, null, view);
                int i12 = f1425 + 99;
                f1423 = i12 % 128;
                if (i12 % 2 != 0) {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1713(JSONObject jSONObject, WebView webView, Object obj, View view) {
                long packedPositionForChild;
                long j10;
                int i10 = f1423 + 35;
                f1425 = i10 % 128;
                if ((i10 % 2 != 0 ? '1' : '\'') != '1') {
                    packedPositionForChild = ExpandableListView.getPackedPositionForChild(0, 0);
                    j10 = 0;
                } else {
                    packedPositionForChild = ExpandableListView.getPackedPositionForChild(1, 0);
                    j10 = 1;
                }
                m1717(m1716("隑⍩\ufd49띫䅭᭢핵潾㥼", 46588 - (packedPositionForChild > j10 ? 1 : (packedPositionForChild == j10 ? 0 : -1))).intern(), jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1704(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1425 + 21;
                f1423 = i10 % 128;
                m1717(m1716("隑\uf061孙ꉃ്鑚Ｅ䘦ꄼࠫ錐礼䗡곋㟥", (i10 % 2 == 0 ? 'P' : '=') != '=' ? 25776 / (ViewConfiguration.getMinimumFlingVelocity() * 77) : 26357 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1706(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 91;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
                m1717(m1716("隑亻⛭ḑ\uf623깨螏翝", (ViewConfiguration.getFadingEdgeLength() >> 16) + 55343).intern(), jSONObject, webView, null, view);
                int i12 = f1423 + 79;
                f1425 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1712(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 11;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
                m1717(m1716("隓\udfe6х䪭댓\uf872⻧霳\udd8d˥䭚", 18787 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), jSONObject, webView, null, view);
                int i12 = f1425 + 105;
                f1423 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1703(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1423 + 19;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
                m1717(m1716("隆煜够⇈থၝ\uf81a샲ꢻ덵鬧揣", ExpandableListView.getPackedPositionType(0L) + 59333).intern(), jSONObject, webView, null, view);
                int i12 = f1423 + 59;
                f1425 = i12 % 128;
                if ((i12 % 2 != 0 ? 'D' : '[') == '[') {
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1709(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1425 + 103;
                f1423 = i10 % 128;
                int i11 = i10 % 2;
                m1717(m1716("隇Ղ넼ⴶ\ud9c4疱\ue195鱼࠭ꐼ僺첤碁\u1775荆㼬꯶䟒\uf380湱", 37847 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, webView, obj, view);
                int i12 = f1423 + 105;
                f1425 = i12 % 128;
                int i13 = i12 % 2;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1717(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1716("隧暘皜䚗嚛⚂㚷ړᚴ\ue690\uf689욏횙ꚓ뚛蚍雎", 61440 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                sb2.append(str);
                cq.m1652(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, webView, obj, view));
                int i10 = f1423 + 55;
                f1425 = i10 % 128;
                int i11 = i10 % 2;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1716(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2019) {
                    com.ironsource.adqualitysdk.sdk.i.f.f2017 = i10;
                    char[] cArr2 = new char[cArr.length];
                    com.ironsource.adqualitysdk.sdk.i.f.f2018 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2018;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2017 * i11))) ^ f1424);
                            com.ironsource.adqualitysdk.sdk.i.f.f2018++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }
        };
        int i10 = f1394 + 21;
        f1397 = i10 % 128;
        int i11 = i10 % 2;
        return vVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1647(String str, boolean z10, boolean z11, List<Object> list) {
        int i10 = f1397 + 71;
        f1394 = i10 % 128;
        int i11 = i10 % 2;
        try {
            dl dlVarM2339 = this.f1405.m2339(str);
            if (!(dlVarM2339 == null)) {
                ds dsVarM2337 = this.f1405.m2337(dlVarM2339.m2009());
                if (!(dsVarM2337 == null)) {
                    int i12 = f1394 + 93;
                    f1397 = i12 % 128;
                    int i13 = i12 % 2;
                    if (z10 == dlVarM2339.m2007()) {
                        if ((z11 == dlVarM2339.m2008() ? '?' : '2') != '?') {
                            return;
                        }
                        if (s.m2951().m2979()) {
                            co.m1626(m1683(), str);
                        }
                        dsVarM2337.m2097(this.f1403, this, list);
                        return;
                    }
                    return;
                }
                String strM1683 = m1683();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1660("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", Color.rgb(0, 0, 0) + 16777238, (byte) (104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern());
                sb2.append(dlVarM2339.m2009());
                sb2.append(m1659("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", 41443 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                co.m1623(strM1683, sb2.toString(), null);
            }
        } catch (Throwable th2) {
            String strM1684 = m1683();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m1659("왻灵\uaa3e\ue4faẨ䤃茀㷐瞘깛\ud868ሤ䳼蚼\u3100欌ꗘ\udf92ᙒ䁱頻", TextUtils.getCapsMode("", 0, 0) + 46649).intern());
            sb3.append(str);
            co.m1623(strM1684, sb3.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m1675(Activity activity, Bundle bundle) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(ih.f2544, m1695().m1612());
            jSONObjectJsonObjectInit.put(ih.f2497, m1695().m1611());
            jSONObjectJsonObjectInit.put(ih.f2499, m1695().m1602());
            jSONObjectJsonObjectInit.put(m1660("\u0002\u0003\n\u001f\u0004\u0016³", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, (byte) (78 - KeyEvent.getDeadChar(0, 0))).intern(), activity.getClass().getName());
            if ((bundle != null ? '.' : '>') == '.') {
                int i10 = f1394 + 19;
                f1397 = i10 % 128;
                int i11 = i10 % 2;
                jSONObjectJsonObjectInit.put(m1660("\u0002\u0003\u0000&\u0004\u0002\u0006\n", (ViewConfiguration.getTapTimeout() >> 16) + 8, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 7)).intern(), true);
            }
            int i12 = f1397 + 59;
            f1394 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
            k.m2810(m1659("왬ဘ櫕䒘齆\ue914쏭ᶏ瑪丌飓\uf2ab쵿✷燱䮡", (ViewConfiguration.getWindowTouchSlop() >> 8) + 54851).intern(), m1659("왻噛\ue662瘔蘐᙭ꛗ㛭䛣횐暬\uf6aa݄靲❜뜆윭埍\ue780矡螁ឲꞪ㐏䑹푣搂\uf436ә铑", ExpandableListView.getPackedPositionGroup(0L) + 36887).intern());
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1659(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2019) {
            com.ironsource.adqualitysdk.sdk.i.f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            com.ironsource.adqualitysdk.sdk.i.f.f2018 = 0;
            while (true) {
                int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2017 * i11))) ^ f1393);
                    com.ironsource.adqualitysdk.sdk.i.f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1660(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f1395;
            char c10 = f1396;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2134 = 0;
                while (true) {
                    int i11 = g.f2134;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2133 = cArr[i11];
                    g.f2131 = cArr[g.f2134 + 1];
                    if (g.f2133 == g.f2131) {
                        cArr3[g.f2134] = (char) (g.f2133 - b10);
                        cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                    } else {
                        g.f2132 = g.f2133 / c10;
                        g.f2130 = g.f2133 % c10;
                        g.f2135 = g.f2131 / c10;
                        g.f2128 = g.f2131 % c10;
                        if (g.f2130 == g.f2128) {
                            g.f2132 = ((g.f2132 + c10) - 1) % c10;
                            g.f2135 = ((g.f2135 + c10) - 1) % c10;
                            int i12 = (g.f2132 * c10) + g.f2130;
                            int i13 = (g.f2135 * c10) + g.f2128;
                            int i14 = g.f2134;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2132 == g.f2135) {
                            g.f2130 = ((g.f2130 + c10) - 1) % c10;
                            g.f2128 = ((g.f2128 + c10) - 1) % c10;
                            int i15 = (g.f2132 * c10) + g.f2130;
                            int i16 = (g.f2135 * c10) + g.f2128;
                            int i17 = g.f2134;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2132 * c10) + g.f2128;
                            int i19 = (g.f2135 * c10) + g.f2130;
                            int i20 = g.f2134;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2134 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
