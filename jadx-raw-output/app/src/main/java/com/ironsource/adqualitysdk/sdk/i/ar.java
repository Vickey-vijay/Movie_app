package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
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
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ar extends AnonymousClass4 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ar f361;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private JSONObject f362;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ax f363;

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        public final synchronized JSONObject m517() {
            return this.f362;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public synchronized void mo519(JSONObject jSONObject) {
            this.f362 = jSONObject;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final ax m518() {
            return this.f363;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m520(ax axVar) {
            this.f363 = axVar;
        }
    }

    public static class a extends ar {

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        private static int f364 = 1;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static char f365 = 5;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static int f366;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private static char[] f367 = {'e', 'n', 'v', 'c', 'g', 'l', 't', 's', 'a', 'b', 'd', 'q', 'r', 'k', '.', 'm', 'o', 'f', 'i', 'h', 'R', 'C', 'p', 'U', 'T'};

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static int[] f368 = {-81983579, -2138919679, -2091503318, 1361753917, -1791869496, 2042201685, -849660709, 193592439, 18121261, 1108331668, 557020721, -1451000058, 935243444, -1090763053, -957734026, -1238215441, 1683544758, 378638243};

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private boolean f369;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private boolean f370;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private int f371;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private boolean f372;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private List f373;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private al f374;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private ap f375;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<av> f376;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<av> f377;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private av f378;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private c f379;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private iw f380;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private as f381;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private aq f382;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private au f383;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private Handler f384;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final int f385;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private final int f386;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final int f387;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private je f388;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f389;

        public a() {
            super((byte) 0);
            m530("\u0001\u0002£", 3 - View.resolveSize(0, 0), (byte) (46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
            m531(new int[]{1346807643, -110320428}, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
            m530("\u0004\u0000\u0006\u0007", 4 - View.MeasureSpec.getMode(0), (byte) (86 - Color.alpha(0))).intern();
            m530("\u0002\b\u0006\u0007", 4 - ExpandableListView.getPackedPositionGroup(0L), (byte) (Process.getGidForName("") + 62)).intern();
            m531(new int[]{556728592, 2019290960}, 4 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
            m530("\t\u0007\u0007\u0005", (ViewConfiguration.getTapTimeout() >> 16) + 4, (byte) ((-16777206) - Color.rgb(0, 0, 0))).intern();
            m531(new int[]{-1424613954, 342081122}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4).intern();
            m530("\b\u0006\u009f", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, (byte) (TextUtils.indexOf("", "") + 59)).intern();
            m530("\b\t\f\u0006", 4 - TextUtils.indexOf("", ""), (byte) (89 - TextUtils.indexOf("", "", 0))).intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f385 = (int) timeUnit2.toMillis(5L);
            this.f389 = (int) timeUnit.toMillis(12L);
            this.f386 = (int) timeUnit2.toMillis(3L);
            this.f387 = (int) timeUnit2.toMillis(10L);
            this.f371 = 0;
            this.f373 = null;
            this.f369 = false;
        }

        /* JADX INFO: renamed from: K, reason: contains not printable characters */
        private synchronized void m521() {
            int i10 = f364 + 69;
            f366 = i10 % 128;
            if ((i10 % 2 != 0 ? 'b' : (char) 6) == 'b') {
                throw null;
            }
            Handler handler = this.f384;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        a.this.m545(true);
                        if (a.m524(a.this) != null) {
                            a.m524(a.this).mo317();
                        }
                        Iterator it = new ArrayList(a.m540(a.this)).iterator();
                        while (it.hasNext()) {
                            ((av) it.next()).mo317();
                        }
                        a.m540(a.this).clear();
                        Iterator it2 = new ArrayList(a.m535(a.this)).iterator();
                        while (it2.hasNext()) {
                            ((av) it2.next()).mo317();
                        }
                    }
                });
                int i11 = f366 + 125;
                f364 = i11 % 128;
                if (i11 % 2 == 0) {
                }
            }
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ av m524(a aVar) {
            int i10 = f366 + 5;
            f364 = i10 % 128;
            boolean z10 = i10 % 2 != 0;
            av avVar = aVar.f378;
            if (!z10) {
                int i11 = 49 / 0;
            }
            return avVar;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ int m525(a aVar) {
            int i10 = f364 + 121;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            int iM523 = aVar.m523();
            int i12 = f364 + 61;
            f366 = i12 % 128;
            int i13 = i12 % 2;
            return iM523;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ int m526(a aVar) {
            int i10 = f366;
            int i11 = i10 + 71;
            f364 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = aVar.f371;
            aVar.f371 = i13 + 1;
            int i14 = i10 + 21;
            f364 = i14 % 128;
            if ((i14 % 2 == 0 ? '\t' : ':') == ':') {
                return i13;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ Handler m527(a aVar) {
            int i10 = f366 + 29;
            f364 = i10 % 128;
            char c10 = i10 % 2 == 0 ? 'G' : '4';
            Handler handler = aVar.f384;
            if (c10 != '4') {
                int i11 = 78 / 0;
            }
            return handler;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ je m528(a aVar) {
            int i10 = f364 + 55;
            int i11 = i10 % 128;
            f366 = i11;
            boolean z10 = i10 % 2 != 0;
            je jeVar = aVar.f388;
            if (z10) {
                throw null;
            }
            int i12 = i11 + 69;
            f364 = i12 % 128;
            if (!(i12 % 2 == 0)) {
                return jeVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ c m529(a aVar) {
            int i10 = f366 + 75;
            int i11 = i10 % 128;
            f364 = i11;
            int i12 = i10 % 2;
            c cVar = aVar.f379;
            int i13 = i11 + 3;
            f366 = i13 % 128;
            if ((i13 % 2 != 0 ? 'J' : (char) 21) != 'J') {
                return cVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ av m533(a aVar, av avVar) {
            int i10 = f364;
            int i11 = i10 + 89;
            f366 = i11 % 128;
            int i12 = i11 % 2;
            aVar.f378 = avVar;
            int i13 = i10 + 91;
            f366 = i13 % 128;
            int i14 = i13 % 2;
            return avVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ void m538(a aVar) {
            int i10 = f364 + 79;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            aVar.m521();
            int i12 = f364 + 25;
            f366 = i12 % 128;
            if ((i12 % 2 != 0 ? '=' : (char) 18) != '=') {
                return;
            }
            int i13 = 15 / 0;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m540(a aVar) {
            int i10 = f366;
            int i11 = i10 + 7;
            f364 = i11 % 128;
            int i12 = i11 % 2;
            List<av> list = aVar.f376;
            int i13 = i10 + 13;
            f364 = i13 % 128;
            int i14 = i13 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        public final synchronized iw m543() {
            iw iwVar;
            int i10 = f366;
            int i11 = i10 + 73;
            f364 = i11 % 128;
            if ((i11 % 2 == 0 ? '8' : '<') != '<') {
                iwVar = this.f380;
                int i12 = 99 / 0;
            } else {
                iwVar = this.f380;
            }
            int i13 = i10 + 99;
            f364 = i13 % 128;
            if (i13 % 2 != 0) {
                return iwVar;
            }
            int i14 = 45 / 0;
            return iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヶ */
        public final int mo486() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m517().optInt(m530("\b\u0006\u009f", 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 59)).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: טּ */
        public final synchronized void mo491() {
            this.f384.removeCallbacksAndMessages(null);
            this.f384 = null;
            t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    a.m540(a.this).clear();
                    a.m535(a.this).clear();
                    a.m533(a.this, (av) null);
                }
            });
            int i10 = f366 + 65;
            f364 = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private JSONObject m522() {
            int i10 = f364 + 125;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            String strM2637 = this.f388.m2637(m530("\r\u0002\u0015\u0006\u0012\u0013\t\u0013\b\r\u0004\u0012Ú", 13 - Color.argb(0, 0, 0, 0), (byte) (Gravity.getAbsoluteGravity(0, 0) + 117)).intern());
            if (strM2637 != null) {
                try {
                    return IronSourceVideoBridge.jsonObjectInit(strM2637);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            int i12 = f366 + 97;
            f364 = i12 % 128;
            if ((i12 % 2 == 0 ? ' ' : 'J') != ' ') {
                return jSONObjectJsonObjectInit;
            }
            int i13 = 55 / 0;
            return jSONObjectJsonObjectInit;
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private int m523() {
            int i10 = f366 + 19;
            f364 = i10 % 128;
            int iOptInt = i10 % 2 != 0 ? m517().optInt(m531(new int[]{-1302242163, -58660411}, ImageFormat.getBitsPerPixel(0) + 5).intern(), 3) : m517().optInt(m531(new int[]{-1302242163, -58660411}, 5 % ImageFormat.getBitsPerPixel(1)).intern(), 2);
            int i11 = f366 + 29;
            f364 = i11 % 128;
            if (i11 % 2 != 0) {
                return iOptInt;
            }
            int i12 = 24 / 0;
            return iOptInt;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ void m532(JSONObject jSONObject, long j10) {
            int i10 = f364 + 27;
            f366 = i10 % 128;
            char c10 = i10 % 2 != 0 ? '\f' : 'X';
            m536(jSONObject, j10);
            if (c10 == '\f') {
                throw null;
            }
            int i11 = f364 + 5;
            f366 = i11 % 128;
            if ((i11 % 2 != 0 ? 'A' : (char) 11) == 11) {
            } else {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ List m535(a aVar) {
            int i10 = f364 + 83;
            int i11 = i10 % 128;
            f366 = i11;
            char c10 = i10 % 2 != 0 ? 'M' : 'N';
            List<av> list = aVar.f377;
            if (c10 == 'M') {
                throw null;
            }
            int i12 = i11 + 57;
            f364 = i12 % 128;
            int i13 = i12 % 2;
            return list;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final int m541() {
            JSONObject jSONObjectM517;
            String strM531;
            int i10 = f364 + 7;
            f366 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 24 : 'c') != 'c') {
                jSONObjectM517 = m517();
                strM531 = m531(new int[]{-810661301, -1583971185}, 4 / ExpandableListView.getPackedPositionChild(1L));
            } else {
                jSONObjectM517 = m517();
                strM531 = m531(new int[]{-810661301, -1583971185}, ExpandableListView.getPackedPositionChild(0L) + 4);
            }
            int iOptInt = jSONObjectM517.optInt(strM531.intern(), this.f389);
            int i11 = f366 + 103;
            f364 = i11 % 128;
            int i12 = i11 % 2;
            return iOptInt;
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        public final int m542() {
            int i10 = f364 + 87;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            int iOptInt = m517().optInt(m530("\u0002\ré", View.MeasureSpec.getMode(0) + 3, (byte) (Color.red(0) + 117)).intern(), this.f385);
            int i12 = f364 + 115;
            f366 = i12 % 128;
            int i13 = i12 % 2;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: リ */
        public final boolean mo484() {
            int i10 = f366 + 97;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            boolean zOptBoolean = m517().optBoolean(m531(new int[]{-1424613954, 342081122}, 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            int i12 = f364 + 97;
            f366 = i12 % 128;
            int i13 = i12 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヮ */
        public final List mo485() {
            if (this.f373 == null) {
                this.f373 = jz.m2805(m517().optJSONArray(m530("\t\u0007\u0007\u0005", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10)).intern()), new jz.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo550(JSONArray jSONArray, int i10) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i10));
                    }
                });
                int i10 = f364 + 47;
                f366 = i10 % 128;
                int i11 = i10 % 2;
            }
            List list = this.f373;
            int i12 = f366 + 79;
            f364 = i12 % 128;
            if ((i12 % 2 != 0 ? '@' : 'O') == '@') {
                return list;
            }
            int i13 = 5 / 0;
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 丫 */
        public final boolean mo487() {
            int i10 = f364 + 3;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            boolean zOptBoolean = m517().optBoolean(m530("\b\t\f\u0006", 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (KeyEvent.keyCodeFromString("") + 89)).intern());
            int i12 = f366 + 25;
            f364 = i12 % 128;
            int i13 = i12 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 乁 */
        public final long mo488() {
            String strM2637 = this.f388.m2637(m530("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", View.resolveSize(0, 0) + 37, (byte) (62 - ((Process.getThreadPriority(0) + 20) >> 6))).intern());
            if ((!TextUtils.isEmpty(strM2637) ? (char) 22 : 'L') != 22) {
                return 0L;
            }
            int i10 = f366 + 105;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                Long.parseLong(strM2637);
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = Long.parseLong(strM2637);
            int i11 = f366 + 97;
            f364 = i11 % 128;
            int i12 = i11 % 2;
            return j10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 爫 */
        public final String mo489() {
            int i10 = f366 + 13;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            if ((m517() != null ? '\"' : (char) 18) == 18) {
                return null;
            }
            String strOptString = m517().optString(m531(new int[]{1356438421, 723423256}, 4 - View.MeasureSpec.getSize(0)).intern());
            if (TextUtils.isEmpty(strOptString) ? false : true) {
                return strOptString;
            }
            int i12 = f364 + 43;
            f366 = i12 % 128;
            int i13 = i12 % 2;
            String strM667 = m518().m667();
            int i14 = f366 + 25;
            f364 = i14 % 128;
            int i15 = i14 % 2;
            return strM667;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﬤ */
        public final int mo490() {
            int i10 = f366 + 83;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            int iOptInt = m517().optInt(m530("\u0002\b\u0006\u0007", 4 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 61)).intern(), this.f387);
            int i12 = f364 + 51;
            f366 = i12 % 128;
            int i13 = i12 % 2;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: סּ */
        public final int mo492() {
            JSONObject jSONObjectM517;
            int trimmedLength;
            int scrollBarSize;
            int i10 = f364 + 19;
            f366 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 31 : '<') != 31) {
                jSONObjectM517 = m517();
                trimmedLength = TextUtils.getTrimmedLength("") + 4;
                scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 86;
            } else {
                jSONObjectM517 = m517();
                trimmedLength = 3 - TextUtils.getTrimmedLength("");
                scrollBarSize = 30 % (ViewConfiguration.getScrollBarSize() * 93);
            }
            return jSONObjectM517.optInt(m530("\u0004\u0000\u0006\u0007", trimmedLength, (byte) scrollBarSize).intern(), this.f386);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if (m518() != null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if ((m518() != null ? 'I' : 'E') != 'I') goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364 + 105;
            com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        
            r0 = m518().m666();
            r1 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364 + 77;
            com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            if ((r1 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        
            throw null;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ףּ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final org.json.JSONObject mo493() {
            /*
                r4 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f366
                int r0 = r0 + 101
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f364 = r1
                int r0 = r0 % 2
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L10
                r0 = r1
                goto L11
            L10:
                r0 = r2
            L11:
                r3 = 0
                if (r0 == r2) goto L20
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m518()
                r2 = 20
                int r2 = r2 / r1
                if (r0 == 0) goto L2e
                goto L39
            L1e:
                r0 = move-exception
                throw r0
            L20:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m518()
                r1 = 73
                if (r0 == 0) goto L2a
                r0 = r1
                goto L2c
            L2a:
                r0 = 69
            L2c:
                if (r0 == r1) goto L39
            L2e:
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364
                int r0 = r0 + 105
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r1
                int r0 = r0 % 2
                return r3
            L39:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m518()
                org.json.JSONObject r0 = r0.m666()
                int r1 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364
                int r1 = r1 + 77
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r2
                int r1 = r1 % 2
                if (r1 != 0) goto L4e
                return r0
            L4e:
                throw r3     // Catch: java.lang.Throwable -> L4f
            L4f:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ar.a.mo493():org.json.JSONObject");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭖ */
        public final au mo494() {
            int i10 = f364 + 55;
            f366 = i10 % 128;
            if ((i10 % 2 != 0 ? 'a' : '\\') == '\\') {
                return this.f383;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭴ */
        public final ap mo495() {
            int i10 = f366 + 99;
            int i11 = i10 % 128;
            f364 = i11;
            int i12 = i10 % 2;
            ap apVar = this.f375;
            int i13 = i11 + 11;
            f366 = i13 % 128;
            int i14 = i13 % 2;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭸ */
        public final as mo496() {
            int i10 = f366;
            int i11 = i10 + 49;
            f364 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            as asVar = this.f381;
            int i12 = i10 + 107;
            f364 = i12 % 128;
            if ((i12 % 2 == 0 ? 'B' : (char) 16) != 'B') {
                return asVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮉ */
        public final aq mo497() {
            int i10 = f366 + 121;
            int i11 = i10 % 128;
            f364 = i11;
            if ((i10 % 2 == 0 ? (char) 11 : '^') == 11) {
                throw null;
            }
            aq aqVar = this.f382;
            int i12 = i11 + 107;
            f366 = i12 % 128;
            int i13 = i12 % 2;
            return aqVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮌ */
        public final String mo498() {
            JSONObject jSONObjectM517;
            int tapTimeout;
            int mode;
            int i10 = f364 + 13;
            f366 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                jSONObjectM517 = m517();
                tapTimeout = 3 - (ViewConfiguration.getTapTimeout() >> 16);
                mode = View.MeasureSpec.getMode(0) + 45;
            } else {
                jSONObjectM517 = m517();
                tapTimeout = (ViewConfiguration.getTapTimeout() << 125) * 3;
                mode = 70 - View.MeasureSpec.getMode(0);
            }
            String strOptString = jSONObjectM517.optString(m530("\u0001\u0002£", tapTimeout, (byte) mode).intern());
            int i11 = f366 + 83;
            f364 = i11 % 128;
            if ((i11 % 2 == 0 ? '4' : (char) 5) == 5) {
                return strOptString;
            }
            int i12 = 17 / 0;
            return strOptString;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮐ */
        public final double mo499() {
            JSONObject jSONObjectM517;
            String strM531;
            int i10 = f366 + 113;
            f364 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                jSONObjectM517 = m517();
                strM531 = m531(new int[]{556728592, 2019290960}, TextUtils.getCapsMode("", 0, 0) + 4);
            } else {
                jSONObjectM517 = m517();
                strM531 = m531(new int[]{556728592, 2019290960}, 5 >>> TextUtils.getCapsMode("", 0, 0));
            }
            return jSONObjectM517.optDouble(strM531.intern(), 1.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱟ */
        public final boolean mo500() {
            int i10 = f364 + 33;
            int i11 = i10 % 128;
            f366 = i11;
            int i12 = i10 % 2;
            boolean z10 = this.f370;
            int i13 = i11 + 19;
            f364 = i13 % 128;
            if (i13 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱡ */
        public final double mo501() {
            int i10 = f364 + 89;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            double dOptDouble = m517().optDouble(m530("\u0005\u0001ì", 3 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (124 - View.resolveSizeAndState(0, 0, 0))).intern(), 5.0d);
            int i12 = f366 + 73;
            f364 = i12 % 128;
            if (i12 % 2 != 0) {
                return dOptDouble;
            }
            int i13 = 36 / 0;
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﺙ */
        public final int mo502() {
            int iM668 = 3000;
            ax axVarM518 = m518();
            if (axVarM518 != null) {
                int i10 = f366 + 23;
                f364 = i10 % 128;
                if ((i10 % 2 == 0 ? '1' : (char) 0) != '1') {
                    iM668 = axVarM518.m668();
                } else {
                    iM668 = axVarM518.m668();
                    int i11 = 30 / 0;
                }
            }
            int i12 = f366 + 17;
            f364 = i12 % 128;
            if ((i12 % 2 != 0 ? '0' : (char) 17) == '0') {
                return iM668;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo503() {
            int i10 = f364 + 101;
            int i11 = i10 % 128;
            f366 = i11;
            int i12 = i10 % 2;
            boolean z10 = this.f372;
            int i13 = i11 + 105;
            f364 = i13 % 128;
            if ((i13 % 2 == 0 ? 'C' : ']') != 'C') {
                return z10;
            }
            int i14 = 70 / 0;
            return z10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo504() {
            JSONObject jSONObjectM517;
            String strM531;
            int i10 = f364 + 33;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM517 = m517();
                strM531 = m531(new int[]{-1481378087, -1826599106}, 2 / Gravity.getAbsoluteGravity(0, 0));
            } else {
                jSONObjectM517 = m517();
                strM531 = m531(new int[]{-1481378087, -1826599106}, 3 - Gravity.getAbsoluteGravity(0, 0));
            }
            boolean zOptBoolean = jSONObjectM517.optBoolean(strM531.intern(), false);
            int i11 = f366 + 7;
            f364 = i11 % 128;
            int i12 = i11 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo512(final av avVar) {
            int i10 = f366 + 91;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            Handler handler = this.f384;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (a.this.mo503()) {
                            avVar.mo317();
                        } else {
                            a.m540(a.this).add(avVar);
                        }
                    }
                });
                int i12 = f366 + 29;
                f364 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = f364 + 91;
            f366 = i14 % 128;
            if ((i14 % 2 != 0 ? '4' : (char) 1) == 1) {
            } else {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final synchronized void m545(boolean z10) {
            int i10 = f366 + 11;
            int i11 = i10 % 128;
            f364 = i11;
            if ((i10 % 2 == 0 ? 'P' : (char) 25) == 'P') {
                this.f372 = z10;
                throw null;
            }
            this.f372 = z10;
            int i12 = i11 + 79;
            f366 = i12 % 128;
            if ((i12 % 2 != 0 ? 'G' : ';') != ';') {
                throw null;
            }
            throw th;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004c A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:31:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:20:0x004c, please report this as an issue */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass4
        /* JADX INFO: renamed from: ﻛ */
        public final synchronized void mo519(JSONObject jSONObject) {
            int i10;
            if (!(!m537(jSONObject))) {
                int i11 = f366 + 65;
                f364 = i11 % 128;
                if ((i11 % 2 == 0 ? '.' : (char) 1) == '.') {
                    m539(jSONObject);
                    throw null;
                }
                m539(jSONObject);
                super.mo519(jSONObject);
                this.f383.mo519(jSONObject);
                this.f381.mo519(jSONObject);
                this.f382.mo519(jSONObject);
                this.f375.mo519(jSONObject);
                i10 = f366 + 27;
                f364 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            } else {
                super.mo519(jSONObject);
                this.f383.mo519(jSONObject);
                this.f381.mo519(jSONObject);
                this.f382.mo519(jSONObject);
                this.f375.mo519(jSONObject);
                i10 = f366 + 27;
                f364 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
            throw th;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final void mo509(Context context, iw iwVar, al alVar, c cVar, boolean z10) {
            this.f388 = new je(context, m530("\u0007\u000b\r\b\u0004\u0005\r\b\u000e\n\f\u0003\n\u000b\u000e\u0013\n\u0002\u0010\u0011\u0005\u0001\u0001\u0012\u0002\u0010\u0013\u0003", 27 - ExpandableListView.getPackedPositionChild(0L), (byte) (View.MeasureSpec.getMode(0) + 72)).intern(), m531(new int[]{-428506525, -193480751, 2108206326, -1894586225, 1815068023, 1149962225, 515620675, -1355112994, 831061069, -123686041}, 20 - KeyEvent.normalizeMetaState(0)).intern());
            this.f380 = iwVar;
            this.f372 = false;
            this.f370 = z10;
            this.f374 = alVar;
            this.f384 = new Handler(Looper.getMainLooper());
            ax axVar = new ax();
            this.f383 = new au(axVar);
            this.f381 = new as(axVar);
            this.f382 = new aq(axVar);
            this.f375 = new ap();
            mo519(m522());
            m520(axVar);
            this.f379 = cVar;
            this.f376 = new ArrayList();
            this.f377 = new ArrayList();
            int i10 = f364 + 43;
            f366 = i10 % 128;
            if ((i10 % 2 != 0 ? '!' : 'I') != '!') {
            } else {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo515(JSONObject jSONObject) {
            int i10 = f364 + 105;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            mo519(jSONObject);
            m521();
            int i12 = f366 + 95;
            f364 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo513(String str, String str2) {
            int i10 = f364 + 113;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            aw awVarM534 = m534(str);
            if ((awVarM534 != null ? '%' : '7') != '7') {
                if (!(!awVarM534.m658(str2))) {
                    return false;
                }
            }
            int i12 = f366 + 119;
            f364 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo514(final av avVar) {
            int i10 = f364 + 49;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            Handler handler = this.f384;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        a.m533(a.this, avVar);
                        if (a.this.mo503()) {
                            avVar.mo317();
                        }
                    }
                });
                int i12 = f364 + 75;
                f366 = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final String mo511(String str) {
            aw awVarM534 = m534(str);
            if ((awVarM534 != null ? (char) 20 : '6') != 20) {
                return null;
            }
            int i10 = f364 + 33;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            String strM657 = awVarM534.m657();
            int i12 = f366 + 53;
            f364 = i12 % 128;
            if (i12 % 2 != 0) {
                return strM657;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo516() {
            int i10 = f364 + 55;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            boolean zOptBoolean = m517().optBoolean(m531(new int[]{-1202225691, -1025302518}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern(), true);
            int i12 = f366 + 25;
            f364 = i12 % 128;
            int i13 = i12 % 2;
            return zOptBoolean;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m544(long j10) {
            int i10 = f366 + 65;
            f364 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 6 : (char) 31) != 31) {
                throw null;
            }
            if (!this.f369) {
                this.f388.m2641(m530("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", 37 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (62 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), String.valueOf(j10));
                this.f369 = true;
            }
            int i11 = f364 + 99;
            f366 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m539(JSONObject jSONObject) {
            int i10 = f364 + 69;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            jz.m2795(jSONObject, jSONObject.optJSONObject(m530("\u0007\u000b\r\u0017\u0007\b", AndroidCharacter.getMirror('0') - '*', (byte) (7 - Color.argb(0, 0, 0, 0))).intern()));
            int i12 = f366 + 85;
            f364 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo508(iz izVar) {
            int i10 = f366 + 39;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            m518().m670(izVar);
            int i12 = f364 + 113;
            f366 = i12 % 128;
            if (!(i12 % 2 != 0)) {
            } else {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo506(final Context context, final ao aoVar, boolean z10) {
            int i10 = f366 + 113;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            if (z10) {
                t.m2994(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (!a.this.m543().m2542().m2530()) {
                            a.m529(a.this).mo552();
                        } else {
                            if (a.this.mo503()) {
                                return;
                            }
                            a.m529(a.this).mo551();
                        }
                    }
                }, ar.m483().mo492());
            }
            m545(false);
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            try {
                jSONObjectJsonObjectInit = new jq(context, aoVar, mo488()).mo404(IronSourceVideoBridge.jsonObjectInit(), m543().m2542().m2530(), true, false);
                int i12 = f364 + 49;
                f366 = i12 % 128;
                int i13 = i12 % 2;
            } catch (JSONException e10) {
                k.m2830(m530("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", View.MeasureSpec.getMode(0) + 12, (byte) (44 - TextUtils.getOffsetAfter("", 0))).intern(), m531(new int[]{1461733317, 1044056902, -518746095, 635703919, 1515719867, -1711267859, -1048964546, 160505427, -1977465801, 738556905, 1081323132, -1630142639, -138943661, 230175536}, Color.green(0) + 25).intern(), e10);
            }
            m543().m2540(this.f374.m436(m530("\u0010\u0003\u0010\b", 4 - View.combineMeasuredStates(0, 0), (byte) (TextUtils.indexOf("", "") + 2)).intern()), jSONObjectJsonObjectInit, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3

                /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                private static int f393 = 1;

                /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                private static short[] f394 = null;

                /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                private static int f395 = 0;

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static byte[] f396 = {86, 123, -122, 125, 122, -119, -58, 57, 122, 106, -120, -127, -121, 123, 118, -41, 34, -120, -123, 114, -118, 118, -123, -117, -121, -123, 107, -89, 100, -102, -88, 80, 87, -85, 96, -110, -85, 86, -83, -86, 89, -92, 10, 43, 5, -64, 34, -55, -64, 63, -98, 126, 51, 48, -63, -117, 116, 51, -50, 53, 50, -63, -114, 116, 52, -56, 56, -51, -62, 51, -118, 99, -50, 48, -51, -32, 0, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f397 = 117819832;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f398 = 17;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f399 = 25698;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f400 = -847945897;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f401 = 8251;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static char f402 = 37973;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char f403 = 31241;

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo387(iq iqVar) {
                    float f10 = 0.0f;
                    try {
                        int iM2517 = iqVar.m2514().m2517();
                        String strM2518 = iqVar.m2514().m2518();
                        if (iM2517 >= 200) {
                            int i14 = f393 + 103;
                            f395 = i14 % 128;
                            int i15 = i14 % 2;
                            if (iM2517 <= 299) {
                                JSONObject jSONObjectM2513 = iqVar.m2513();
                                try {
                                    if (!(!jSONObjectM2513.optBoolean(m546("¦ﺧ䧢谖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3).intern()))) {
                                        int i16 = f393 + 61;
                                        f395 = i16 % 128;
                                        if ((i16 % 2 != 0 ? (char) 25 : 'G') != 'G') {
                                            s.m2951().m2981();
                                            throw null;
                                        }
                                        s.m2951().m2981();
                                    }
                                    k.m2811(m546("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m548((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 117819833, (short) (ViewConfiguration.getEdgeSlop() >> 16), 847945980 - (Process.myPid() >> 22), (byte) ((-123) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - KeyEvent.normalizeMetaState(0)).intern(), jSONObjectM2513);
                                    JSONObject jSONObjectM2794 = jz.m2794(jSONObjectM2513);
                                    a.this.m544(jSONObjectM2794.optLong(m546("鱨₰\udacb㍧", Color.rgb(0, 0, 0) + 16777220).intern(), 0L));
                                    jSONObjectM2794.remove(m548(((Process.getThreadPriority(0) + 20) >> 6) - 117819804, (short) View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 847946012, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 101), (-15) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                                    a.m528(a.this).m2635(m548((-117819802) - ExpandableListView.getPackedPositionType(0L), (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 847946010 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (85 - Color.blue(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 4).intern(), jSONObjectM2794.toString(), null);
                                    jSONObjectM2513.put(m548((-117819790) - (Process.myTid() >> 22), (short) Color.argb(0, 0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 847946013, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 12), (-15) - (Process.myTid() >> 22)).intern(), jx.m2780());
                                    jSONObjectM2513.put(m546("鰏㋷", 2 - TextUtils.indexOf("", "", 0, 0)).intern(), jx.m2778());
                                    a.m532(jSONObjectM2513, iqVar.m2515());
                                    a.this.mo519(jSONObjectM2513);
                                } catch (Exception e11) {
                                    e = e11;
                                    f10 = 0.0f;
                                    kd.m2879(m546("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", (PointF.length(f10, f10) > f10 ? 1 : (PointF.length(f10, f10) == f10 ? 0 : -1)) + 12).intern(), m546("ᶒ绽῞\ud964渀蠯䬺灁鑋괷蟾\uf6bd䦛狓嗇딳㇎躦ﾉ햄蝙헊뽶줫ӵ\udab6䦛狓涬\ude16뽶줫", View.resolveSize(0, 0) + 32).intern(), (Throwable) e, false, true);
                                }
                                a.m538(a.this);
                                m547(a.this.m541());
                                return;
                            }
                        }
                        mo388(iqVar, strM2518);
                        int i17 = f395 + 111;
                        f393 = i17 % 128;
                        if (i17 % 2 != 0) {
                        } else {
                            throw null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                }

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private void m547(int i14) {
                    synchronized (a.this) {
                        if (a.m527(a.this) != null) {
                            t.m2996(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    a.this.mo506(context, aoVar, false);
                                }
                            }, i14);
                        }
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m548(int i14, short s10, int i15, byte b10, int i16) {
                    String string;
                    synchronized (o.f2993) {
                        StringBuilder sb2 = new StringBuilder();
                        int i17 = f398;
                        int i18 = i16 + i17;
                        boolean z11 = i18 == -1;
                        if (z11) {
                            byte[] bArr = f396;
                            i18 = bArr != null ? (byte) (bArr[f397 + i14] + i17) : (short) (f394[f397 + i14] + i17);
                        }
                        if (i18 > 0) {
                            o.f2994 = ((i14 + i18) - 2) + f397 + (z11 ? 1 : 0);
                            o.f2995 = b10;
                            char c10 = (char) (i15 + f400);
                            o.f2997 = c10;
                            sb2.append(c10);
                            o.f2996 = o.f2997;
                            o.f2998 = 1;
                            while (o.f2998 < i18) {
                                byte[] bArr2 = f396;
                                if (bArr2 != null) {
                                    int i19 = o.f2994;
                                    o.f2994 = i19 - 1;
                                    o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i19] + s10)) ^ o.f2995));
                                } else {
                                    short[] sArr = f394;
                                    int i20 = o.f2994;
                                    o.f2994 = i20 - 1;
                                    o.f2997 = (char) (o.f2996 + (((short) (sArr[i20] + s10)) ^ o.f2995));
                                }
                                sb2.append(o.f2997);
                                o.f2996 = o.f2997;
                                o.f2998++;
                            }
                        }
                        string = sb2.toString();
                    }
                    return string;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo388(iq iqVar, String str) {
                    int iM2517;
                    if (iqVar != null) {
                        int i14 = f395 + 21;
                        f393 = i14 % 128;
                        int i15 = i14 % 2;
                        iM2517 = iqVar.m2514().m2517();
                    } else {
                        iM2517 = -1;
                        int i16 = f393 + 117;
                        f395 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m548((-117819790) - TextUtils.lastIndexOf("", '0', 0, 0), (short) ((Process.getThreadPriority(0) + 20) >> 6), 847945966 - TextUtils.getOffsetAfter("", 0), (byte) ((-51) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf("", "") + 17).intern());
                    sb2.append(iM2517);
                    k.m2814(m546("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - ExpandableListView.getPackedPositionGroup(0L)).intern(), sb2.toString());
                    if (!(iM2517 != 403)) {
                        return;
                    }
                    int i18 = f395 + 99;
                    f393 = i18 % 128;
                    int i19 = i18 % 2;
                    if ((a.m526(a.this) < a.m525(a.this) ? 'L' : '^') != 'L') {
                        return;
                    }
                    m547(a.this.m542());
                }

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m546(String str, int i14) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (n.f2992) {
                        char[] cArr2 = new char[cArr.length];
                        n.f2991 = 0;
                        char[] cArr3 = new char[2];
                        while (true) {
                            int i15 = n.f2991;
                            if (i15 < cArr.length) {
                                cArr3[0] = cArr[i15];
                                cArr3[1] = cArr[i15 + 1];
                                int i16 = 58224;
                                for (int i17 = 0; i17 < 16; i17++) {
                                    char c10 = cArr3[1];
                                    char c11 = cArr3[0];
                                    char c12 = (char) (c10 - (((c11 + i16) ^ ((c11 << 4) + f399)) ^ ((c11 >>> 5) + f401)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f403) ^ ((c12 + i16) ^ ((c12 << 4) + f402))));
                                    i16 -= 40503;
                                }
                                int i18 = n.f2991;
                                cArr2[i18] = cArr3[0];
                                cArr2[i18 + 1] = cArr3[1];
                                n.f2991 = i18 + 2;
                            } else {
                                str2 = new String(cArr2, 0, i14);
                            }
                        }
                    }
                    return str2;
                }
            });
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo510() {
            int i10 = f364 + 25;
            f366 = i10 % 128;
            return !(i10 % 2 == 0) ? m517().optBoolean(m531(new int[]{626012635, -1984863808}, 2 % (KeyEvent.getMaxKeyCode() >>> 25)).intern(), false) : m517().optBoolean(m531(new int[]{626012635, -1984863808}, (KeyEvent.getMaxKeyCode() >> 16) + 4).intern(), true);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static void m536(JSONObject jSONObject, long j10) {
            if ((jSONObject.has(m531(new int[]{-712133822, -224733627}, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? '3' : (char) 2) == '3') {
                int i10 = f364 + 63;
                f366 = i10 % 128;
                try {
                    if ((i10 % 2 != 0 ? (char) 29 : 'E') != 'E') {
                        jSONObject.put(m531(new int[]{-712133822, -224733627}, TextUtils.getCapsMode("", 0, 0) * 2).intern(), (j10 / 2) | jSONObject.optLong(m531(new int[]{-712133822, -224733627}, 5 / Color.green(1)).intern()));
                    } else {
                        jSONObject.put(m531(new int[]{-712133822, -224733627}, 3 - TextUtils.getCapsMode("", 0, 0)).intern(), jSONObject.optLong(m531(new int[]{-712133822, -224733627}, Color.green(0) + 3).intern()) + (j10 / 2));
                    }
                    int i11 = f364 + 91;
                    f366 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return;
                    } else {
                        throw null;
                    }
                } catch (JSONException unused) {
                }
            }
            int i12 = f364 + 31;
            f366 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 31 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo507(final av avVar) {
            int i10 = f366 + 17;
            f364 = i10 % 128;
            if (i10 % 2 != 0) {
                Handler handler = this.f384;
                if (handler != null) {
                    handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            a.m535(a.this).add(avVar);
                            if (a.this.mo503()) {
                                avVar.mo317();
                            }
                        }
                    });
                }
                int i11 = f366 + 1;
                f364 = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean m537(JSONObject jSONObject) {
            int iNormalizeMetaState;
            int i10;
            int i11 = f366 + 121;
            f364 = i11 % 128;
            if (i11 % 2 != 0) {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 6;
                i10 = 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            } else {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(1) * 49;
                i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            }
            boolean zHas = jSONObject.has(m530("\u0007\u000b\r\u0017\u0007\b", iNormalizeMetaState, (byte) i10).intern());
            int i12 = f364 + 103;
            f366 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 2 : '\\') != 2) {
                return zHas;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private aw m534(String str) {
            int i10 = f366;
            int i11 = i10 + 99;
            int i12 = i11 % 128;
            f364 = i12;
            if (i11 % 2 == 0) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str != null) {
                int i13 = i10 + 89;
                f364 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 27 / 0;
                    return mo505().get(str);
                }
                return mo505().get(str);
            }
            int i15 = i12 + 5;
            f366 = i15 % 128;
            if ((i15 % 2 != 0 ? 'L' : (char) 5) != 'L') {
                return null;
            }
            try {
                throw null;
            } catch (Throwable th3) {
                throw th3;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, aw> mo505() {
            Map<String, aw> map = new HashMap<>();
            try {
                String strOptString = m517().optString(m530("\r\u0000î", 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = jz.m2797(IronSourceVideoBridge.jsonObjectInit(strOptString), new jz.c<aw>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ aw mo549(JSONObject jSONObject, String str) {
                            return new aw(jSONObject.optJSONObject(str));
                        }
                    });
                }
                int i10 = f364 + 9;
                f366 = i10 % 128;
                int i11 = i10 % 2;
            } catch (JSONException e10) {
                kd.m2872(m530("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", AndroidCharacter.getMirror('0') - '$', (byte) (43 - MotionEvent.axisFromString(""))).intern(), m531(new int[]{1461733317, 1044056902, 428215858, -1961072058, -65074011, -1059125625, 1581561942, -1481391031, -157161790, -1026405494, -2084764877, 218133828, -2117089186, 682257840, 1457645334, 2131892427}, (ViewConfiguration.getTouchSlop() >> 8) + 31).intern(), e10, false);
            }
            return map;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m530(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                char[] cArr2 = f367;
                char c10 = f365;
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m531(int[] iArr, int i10) {
            String str;
            synchronized (e.f1912) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f368.clone();
                e.f1913 = 0;
                while (true) {
                    int i11 = e.f1913;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1915 = (c10 << 16) + c11;
                        e.f1914 = (c12 << 16) + c13;
                        e.m2135(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1915 ^ iArr2[i13];
                            e.f1915 = i14;
                            e.f1914 = e.m2134(i14) ^ e.f1914;
                            int i15 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i15;
                        }
                        int i16 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i16;
                        e.f1914 = i16 ^ iArr2[16];
                        e.f1915 ^= iArr2[17];
                        int i17 = e.f1913;
                        int i18 = e.f1915;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1914;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m2135(iArr2);
                        int i20 = e.f1913;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1913 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            }
            return str;
        }
    }

    public interface c {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo551();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo552();
    }

    public /* synthetic */ ar(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract boolean mo484();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract List mo485();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract int mo486();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract boolean mo487();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract long mo488();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract String mo489();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract int mo490();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract void mo491();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract int mo492();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract JSONObject mo493();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract au mo494();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract ap mo495();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract as mo496();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract aq mo497();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract String mo498();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract double mo499();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract boolean mo500();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract double mo501();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract int mo502();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract boolean mo503();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo504();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract Map<String, aw> mo505();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo506(Context context, ao aoVar, boolean z10);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo507(av avVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo508(iz izVar);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo509(Context context, iw iwVar, al alVar, c cVar, boolean z10);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo510();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract String mo511(String str);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo512(av avVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo513(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo514(av avVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo515(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo516();

    private ar() {
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized ar m483() {
        if (f361 == null) {
            f361 = new a();
        }
        return f361;
    }
}
