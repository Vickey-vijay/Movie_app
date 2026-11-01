package sg.bigo.ads.core.c;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.adsession.media.Position;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.ironsource.C3426d4;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaEvents f71196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f71197b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final AdSession f71198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final AdEvents f71199d;

    /* JADX INFO: renamed from: sg.bigo.ads.core.c.b$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71202b;

        static {
            int[] iArr = new int[a.a().length];
            f71202b = iArr;
            try {
                iArr[a.f71203a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71202b[a.f71204b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71202b[a.f71205c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71202b[a.f71206d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71202b[a.f71207e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0733b.a().length];
            f71201a = iArr2;
            try {
                iArr2[EnumC0733b.f71209a - 1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71201a[EnumC0733b.f71210b - 1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f71201a[EnumC0733b.f71211c - 1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f71201a[EnumC0733b.f71212d - 1] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f71203a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f71204b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f71205c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f71206d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f71207e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ int[] f71208f = {1, 2, 3, 4, 5};

        public static int[] a() {
            return (int[]) f71208f.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: sg.bigo.ads.core.c.b$b, reason: collision with other inner class name */
    public static final class EnumC0733b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f71209a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f71210b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f71211c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f71212d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ int[] f71213e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) f71213e.clone();
        }
    }

    public b(@NonNull AdSession adSession, @Nullable MediaEvents mediaEvents) {
        this.f71198c = adSession;
        this.f71196a = mediaEvents;
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        this.f71199d = adEventsCreateAdEvents;
        if (this.f71196a != null) {
            try {
                adEventsCreateAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                a(C3426d4.i.f28562r);
            } catch (Exception unused) {
            }
        } else {
            try {
                adEventsCreateAdEvents.loaded();
                a(C3426d4.i.f28562r);
            } catch (Exception unused2) {
            }
        }
    }

    public final void a() {
        try {
            this.f71199d.impressionOccurred();
            a("impression");
        } catch (Exception unused) {
        }
    }

    public final void a(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        MediaEvents mediaEvents = this.f71196a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.start(f10, f11);
        this.f71197b = true;
        a("video start, duration: " + f10 + ", volume: " + f11);
    }

    public final void a(int i10) {
        String str;
        MediaEvents mediaEvents = this.f71196a;
        if (mediaEvents == null) {
            return;
        }
        int i11 = AnonymousClass2.f71201a[i10 - 1];
        if (i11 == 1) {
            mediaEvents.firstQuartile();
            str = "video first quartile";
        } else if (i11 == 2) {
            mediaEvents.midpoint();
            str = "video mid point";
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                mediaEvents.complete();
                a("video complete");
                return;
            }
            mediaEvents.thirdQuartile();
            str = "video third quartile";
        }
        a(str);
    }

    public final void a(InteractionType interactionType) {
        MediaEvents mediaEvents = this.f71196a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.adUserInteraction(interactionType);
        a("ad user interaction: " + interactionType.toString());
    }

    public final void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "OMSDK", "Event: " + str + " (" + this.f71198c.getAdSessionId() + ")");
    }

    public final void b() {
        if (d.b()) {
            c();
        } else {
            d.a(2, new Runnable() { // from class: sg.bigo.ads.core.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
        this.f71196a = null;
    }

    public final void b(int i10) {
        String str;
        MediaEvents mediaEvents = this.f71196a;
        if (mediaEvents == null) {
            return;
        }
        int i11 = AnonymousClass2.f71202b[i10 - 1];
        if (i11 == 1) {
            mediaEvents.pause();
            str = "video pause";
        } else if (i11 == 2) {
            mediaEvents.resume();
            str = "video resume";
        } else if (i11 == 3) {
            mediaEvents.bufferStart();
            str = "video buffer start";
        } else {
            if (i11 != 4) {
                if (i11 != 5) {
                    return;
                }
                mediaEvents.skipped();
                a("video skipped");
                return;
            }
            mediaEvents.bufferFinish();
            str = "video buffer finish";
        }
        a(str);
    }

    public final void c() {
        try {
            this.f71198c.finish();
        } catch (Throwable unused) {
        }
    }
}
