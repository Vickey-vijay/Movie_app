package yads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class mm1 implements af, he2 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe0 f80260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f80261c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f80267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f80268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80269k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public be2 f80272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public lm1 f80273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lm1 f80274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public lm1 f80275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mx0 f80276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public mx0 f80277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mx0 f80278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f80279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f80280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f80281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f80282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f80283y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f80284z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r63 f80263e = new r63();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p63 f80264f = new p63();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f80266h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f80265g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f80262d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f80270l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80271m = 0;

    public final boolean a(lm1 lm1Var) {
        String str;
        if (lm1Var != null) {
            String str2 = lm1Var.f79853c;
            oe0 oe0Var = this.f80260b;
            synchronized (oe0Var) {
                str = oe0Var.f81020g;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ye yeVar, String str) {
        ym1 ym1Var = yeVar.f84912d;
        if ((ym1Var == null || !ym1Var.a()) && str.equals(this.f80267i)) {
            a();
        }
        this.f80265g.remove(str);
        this.f80266h.remove(str);
    }

    public mm1(Context context, PlaybackSession playbackSession) {
        this.f80259a = context.getApplicationContext();
        this.f80261c = playbackSession;
        oe0 oe0Var = new oe0();
        this.f80260b = oe0Var;
        oe0Var.a(this);
    }

    public final void a() {
        PlaybackMetrics.Builder builder = this.f80268j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f80284z);
            this.f80268j.setVideoFramesDropped(this.f80282x);
            this.f80268j.setVideoFramesPlayed(this.f80283y);
            Long l10 = (Long) this.f80265g.get(this.f80267i);
            this.f80268j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f80266h.get(this.f80267i);
            this.f80268j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f80268j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f80261c.reportPlaybackMetrics(this.f80268j.build());
        }
        this.f80268j = null;
        this.f80267i = null;
        this.f80284z = 0;
        this.f80282x = 0;
        this.f80283y = 0;
        this.f80276r = null;
        this.f80277s = null;
        this.f80278t = null;
        this.A = false;
    }

    public final void a(s63 s63Var, ym1 ym1Var) {
        int iA;
        PlaybackMetrics.Builder builder = this.f80268j;
        if (ym1Var == null || (iA = s63Var.a(ym1Var.f82311a)) == -1) {
            return;
        }
        int i10 = 0;
        s63Var.a(iA, this.f80264f, false);
        s63Var.a(this.f80264f.f81268d, this.f80263e, 0L);
        am1 am1Var = this.f80263e.f82120d.f77444c;
        if (am1Var != null) {
            int iA2 = ib3.a(am1Var.f85472a, am1Var.f85473b);
            if (iA2 == 0) {
                i10 = 3;
            } else if (iA2 != 1) {
                i10 = iA2 != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        r63 r63Var = this.f80263e;
        if (r63Var.f82131o != -9223372036854775807L && !r63Var.f82129m && !r63Var.f82126j && !r63Var.a()) {
            builder.setMediaDurationMillis(ib3.b(this.f80263e.f82131o));
        }
        builder.setPlaybackType(this.f80263e.a() ? 2 : 1);
        this.A = true;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x024c  */
    /* JADX WARN: Code duplicated, block: B:154:0x024f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0252  */
    /* JADX WARN: Code duplicated, block: B:266:0x0424  */
    /* JADX WARN: Code duplicated, block: B:272:0x0435  */
    /* JADX WARN: Code duplicated, block: B:273:0x0437  */
    /* JADX WARN: Code duplicated, block: B:274:0x043a  */
    /* JADX WARN: Code duplicated, block: B:275:0x043d  */
    /* JADX WARN: Code duplicated, block: B:276:0x043f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0511  */
    /* JADX WARN: Code duplicated, block: B:406:0x0668 A[PHI: r2
  0x0668: PHI (r2v88 int) = (r2v87 int), (r2v86 int) binds: [B:404:0x0663, B:394:0x0647] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:426:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:12:0x0035, B:13:0x004a, B:15:0x0050, B:17:0x0060, B:28:0x0097, B:38:0x00af, B:40:0x00b6, B:42:0x00c0, B:43:0x00c2, B:31:0x009c, B:36:0x00a9, B:34:0x00a1, B:20:0x0067, B:21:0x0076, B:23:0x007e, B:25:0x0088, B:26:0x0093, B:44:0x00cd), top: B:419:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:432:0x004a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [yads.mm1] */
    /* JADX WARN: Type inference failed for: r2v95, types: [android.media.metrics.NetworkEvent$Builder] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [int] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [int] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [int] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(oe2 oe2Var, ze zeVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        char c10;
        int i13;
        km1 km1Var;
        char c11;
        int i14;
        km1 km1Var2;
        int i15;
        int i16;
        char c12;
        int i17;
        km1 km1Var3;
        boolean z11;
        int i18;
        ?? r10;
        int i19;
        kk0 kk0Var;
        int i20;
        ym1 ym1Var;
        if (zeVar.f85365a.f76817a.size() == 0) {
            return;
        }
        for (int i21 = 0; i21 < zeVar.f85365a.f76817a.size(); i21++) {
            int iA = zeVar.f85365a.a(i21);
            ye yeVar = (ye) zeVar.f85366b.get(iA);
            yeVar.getClass();
            if (iA == 0) {
                oe0 oe0Var = this.f80260b;
                synchronized (oe0Var) {
                    oe0Var.f81018e.getClass();
                    s63 s63Var = oe0Var.f81019f;
                    oe0Var.f81019f = yeVar.f84910b;
                    Iterator it = oe0Var.f81016c.values().iterator();
                    while (it.hasNext()) {
                        ne0 ne0Var = (ne0) it.next();
                        s63 s63Var2 = oe0Var.f81019f;
                        int i22 = ne0Var.f80652b;
                        if (i22 >= s63Var.b()) {
                            if (i22 >= s63Var2.b()) {
                                i22 = -1;
                                break;
                            }
                        } else {
                            s63Var.a(i22, ne0Var.f80657g.f81014a, 0L);
                            int i23 = ne0Var.f80657g.f81014a.f82132p;
                            while (true) {
                                if (i23 > ne0Var.f80657g.f81014a.f82133q) {
                                    i22 = -1;
                                    break;
                                }
                                int iA2 = s63Var2.a(s63Var.a(i23));
                                if (iA2 != -1) {
                                    i22 = s63Var2.a(iA2, ne0Var.f80657g.f81015b, false).f81268d;
                                    break;
                                }
                                i23++;
                            }
                        }
                        ne0Var.f80652b = i22;
                        if (i22 != -1 && ((ym1Var = ne0Var.f80654d) == null || s63Var2.a(ym1Var.f82311a) != -1)) {
                            if (ne0Var.a(yeVar)) {
                                it.remove();
                                if (!ne0Var.f80655e) {
                                    if (ne0Var.f80651a.equals(oe0Var.f81020g)) {
                                        oe0Var.f81020g = null;
                                    }
                                    ((mm1) oe0Var.f81018e).b(yeVar, ne0Var.f80651a);
                                }
                            }
                        } else {
                            it.remove();
                            if (!ne0Var.f80655e) {
                                if (ne0Var.f80651a.equals(oe0Var.f81020g)) {
                                    oe0Var.f81020g = null;
                                }
                                ((mm1) oe0Var.f81018e).b(yeVar, ne0Var.f80651a);
                            }
                        }
                    }
                    oe0Var.b(yeVar);
                }
            } else if (iA == 11) {
                this.f80260b.a(yeVar, this.f80269k);
            } else {
                this.f80260b.c(yeVar);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zeVar.a(0)) {
            ye yeVar2 = (ye) zeVar.f85366b.get(0);
            yeVar2.getClass();
            if (this.f80268j != null) {
                a(yeVar2.f84910b, yeVar2.f84912d);
            }
        }
        if (zeVar.a(2) && this.f80268j != null) {
            zn0 zn0Var = (zn0) oe2Var;
            zn0Var.r();
            m51 m51VarListIterator = zn0Var.Z.f76257i.f82910d.f80973b.listIterator(0);
            loop3: while (true) {
                if (!m51VarListIterator.hasNext()) {
                    kk0Var = null;
                    break;
                }
                n83 n83Var = (n83) m51VarListIterator.next();
                for (int i24 = 0; i24 < n83Var.f80598b; i24++) {
                    if (n83Var.f80602f[i24] && (kk0Var = n83Var.f80599c.f78090e[i24].f80432p) != null) {
                        break loop3;
                    }
                }
            }
            if (kk0Var != null) {
                PlaybackMetrics.Builder builder = this.f80268j;
                int i25 = ib3.f78556a;
                int i26 = 0;
                while (true) {
                    if (i26 >= kk0Var.f79438e) {
                        i20 = 1;
                        break;
                    }
                    UUID uuid = kk0Var.f79435b[i26].f79077c;
                    if (uuid.equals(jr.f79152d)) {
                        i20 = 3;
                        break;
                    } else if (uuid.equals(jr.f79153e)) {
                        i20 = 2;
                        break;
                    } else {
                        if (uuid.equals(jr.f79151c)) {
                            i20 = 6;
                            break;
                        }
                        i26++;
                    }
                }
                builder.setDrmType(i20);
            }
        }
        if (zeVar.a(1011)) {
            this.f80284z++;
        }
        be2 be2Var = this.f80272n;
        int i27 = 4;
        if (be2Var == null) {
            z11 = true;
            c10 = '\b';
            i13 = 7;
            i11 = 9;
            i12 = 6;
        } else {
            Context context = this.f80259a;
            boolean z12 = this.f80280v == 4;
            if (be2Var.f75792b == 1001) {
                km1Var = new km1(20, 0);
            } else {
                if (be2Var instanceof pn0) {
                    pn0 pn0Var = (pn0) be2Var;
                    boolean z13 = pn0Var.f81460d == 1;
                    i10 = pn0Var.f81464h;
                    z10 = z13;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = be2Var.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof s11) {
                        km1Var3 = new km1(5, ((s11) cause).f82491e);
                    } else {
                        if (!(cause instanceof r11) && !(cause instanceof ob2)) {
                            boolean z14 = cause instanceof q11;
                            if (!z14 && !(cause instanceof z93)) {
                                if (be2Var.f75792b == 1002) {
                                    km1Var = new km1(21, 0);
                                } else if (cause instanceof lk0) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    int i28 = ib3.f78556a;
                                    if (i28 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                        int iA3 = ib3.a(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                        if (iA3 == 2 || iA3 == 4) {
                                            c12 = 6005;
                                        } else if (iA3 == 10) {
                                            c12 = 6004;
                                        } else if (iA3 == 7) {
                                            c12 = 6005;
                                        } else if (iA3 != 8) {
                                            switch (iA3) {
                                                case 15:
                                                    c12 = 6003;
                                                    break;
                                                case 16:
                                                case 18:
                                                    c12 = 6005;
                                                    break;
                                                case 17:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                    c12 = 6004;
                                                    break;
                                                default:
                                                    switch (iA3) {
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                        case 27:
                                                        case 28:
                                                            c12 = 6002;
                                                            break;
                                                        default:
                                                            c12 = 6006;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            c12 = 6003;
                                        }
                                        switch (c12) {
                                            case 6002:
                                                i17 = 24;
                                                break;
                                            case 6003:
                                                i17 = 28;
                                                break;
                                            case 6004:
                                                i17 = 25;
                                                break;
                                            case 6005:
                                                i17 = 26;
                                                break;
                                            default:
                                                i17 = 27;
                                                break;
                                        }
                                        km1Var3 = new km1(i17, iA3);
                                    } else if (i28 >= 23 && (cause2 instanceof MediaDrmResetException)) {
                                        km1Var = new km1(27, 0);
                                    } else if (i28 >= 18 && (cause2 instanceof NotProvisionedException)) {
                                        km1Var = new km1(24, 0);
                                    } else if (i28 >= 18 && (cause2 instanceof DeniedByServerException)) {
                                        km1Var = new km1(29, 0);
                                    } else if (cause2 instanceof la3) {
                                        km1Var = new km1(23, 0);
                                    } else if (cause2 instanceof cd0) {
                                        km1Var = new km1(28, 0);
                                    } else {
                                        km1Var = new km1(30, 0);
                                    }
                                } else if ((cause instanceof bv0) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    if (ib3.f78556a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                        km1Var = new km1(32, 0);
                                    } else {
                                        km1Var = new km1(31, 0);
                                    }
                                } else {
                                    i15 = 9;
                                    km1Var = new km1(9, 0);
                                }
                            } else {
                                i15 = 9;
                                if (o82.a(context).a() == 1) {
                                    km1Var = new km1(3, 0);
                                } else {
                                    Throwable cause5 = cause.getCause();
                                    if (cause5 instanceof UnknownHostException) {
                                        i16 = 6;
                                        km1Var = new km1(6, 0);
                                    } else {
                                        i16 = 6;
                                        if (cause5 instanceof SocketTimeoutException) {
                                            i13 = 7;
                                            km1Var = new km1(7, 0);
                                            i11 = 9;
                                            i12 = 6;
                                            c10 = '\b';
                                        } else {
                                            if (z14 && ((q11) cause).f81676d == 1) {
                                                km1Var = new km1(4, 0);
                                            } else {
                                                km1Var = new km1(8, 0);
                                                i11 = 9;
                                                c10 = '\b';
                                                i12 = 6;
                                            }
                                            i13 = 7;
                                        }
                                        this.f80261c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).setErrorCode(km1Var.f79471a).setSubErrorCode(km1Var.f79472b).setException(be2Var).build());
                                        z11 = true;
                                        this.A = true;
                                        this.f80272n = null;
                                    }
                                }
                            }
                            i11 = i15;
                            c10 = '\b';
                            i13 = 7;
                            i12 = 6;
                            this.f80261c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).setErrorCode(km1Var.f79471a).setSubErrorCode(km1Var.f79472b).setException(be2Var).build());
                            z11 = true;
                            this.A = true;
                            this.f80272n = null;
                        } else {
                            i15 = 9;
                            i16 = 6;
                            km1Var = new km1(z12 ? 10 : 11, 0);
                        }
                        i11 = i15;
                        i12 = i16;
                    }
                    km1Var = km1Var3;
                } else {
                    i11 = 9;
                    i12 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        km1Var = new km1(35, 0);
                    } else if (z10 && i10 == 3) {
                        km1Var = new km1(15, 0);
                    } else {
                        if (z10 && i10 == 2) {
                            km1Var = new km1(23, 0);
                        } else {
                            if (cause instanceof lk1) {
                                km1Var2 = new km1(13, ib3.a(((lk1) cause).f79832e));
                            } else {
                                if (cause instanceof hk1) {
                                    km1Var = new km1(14, ib3.a(((hk1) cause).f78258b));
                                } else if (cause instanceof OutOfMemoryError) {
                                    km1Var = new km1(14, 0);
                                } else if (cause instanceof fl) {
                                    km1Var2 = new km1(17, ((fl) cause).f77426b);
                                } else if (cause instanceof il) {
                                    km1Var2 = new km1(18, ((il) cause).f78690b);
                                } else if (ib3.f78556a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    if (errorCode == 2 || errorCode == 4) {
                                        c10 = '\b';
                                        i13 = 7;
                                    } else {
                                        if (errorCode != 10) {
                                            i13 = 7;
                                            c10 = '\b';
                                            if (errorCode != 7) {
                                                if (errorCode != 8) {
                                                    switch (errorCode) {
                                                        case 15:
                                                            c11 = 6003;
                                                            break;
                                                        case 16:
                                                        case 18:
                                                            break;
                                                        case 17:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                            break;
                                                        default:
                                                            switch (errorCode) {
                                                                case 24:
                                                                case 25:
                                                                case 26:
                                                                case 27:
                                                                case 28:
                                                                    c11 = 6002;
                                                                    break;
                                                                default:
                                                                    c11 = 6006;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    c11 = 6003;
                                                }
                                            }
                                            switch (c11) {
                                                case 6002:
                                                    i14 = 24;
                                                    break;
                                                case 6003:
                                                    i14 = 28;
                                                    break;
                                                case 6004:
                                                    i14 = 25;
                                                    break;
                                                case 6005:
                                                    i14 = 26;
                                                    break;
                                                default:
                                                    i14 = 27;
                                                    break;
                                            }
                                            km1Var = new km1(i14, errorCode);
                                        } else {
                                            c10 = '\b';
                                            i13 = 7;
                                        }
                                        c11 = 6004;
                                        switch (c11) {
                                            case 6002:
                                                i14 = 24;
                                                break;
                                            case 6003:
                                                i14 = 28;
                                                break;
                                            case 6004:
                                                i14 = 25;
                                                break;
                                            case 6005:
                                                i14 = 26;
                                                break;
                                            default:
                                                i14 = 27;
                                                break;
                                        }
                                        km1Var = new km1(i14, errorCode);
                                    }
                                    c11 = 6005;
                                    switch (c11) {
                                        case 6002:
                                            i14 = 24;
                                            break;
                                        case 6003:
                                            i14 = 28;
                                            break;
                                        case 6004:
                                            i14 = 25;
                                            break;
                                        case 6005:
                                            i14 = 26;
                                            break;
                                        default:
                                            i14 = 27;
                                            break;
                                    }
                                    km1Var = new km1(i14, errorCode);
                                } else {
                                    c10 = '\b';
                                    i13 = 7;
                                    km1Var = new km1(22, 0);
                                }
                                c10 = '\b';
                                i13 = 7;
                            }
                            km1Var = km1Var2;
                            c10 = '\b';
                            i13 = 7;
                        }
                        this.f80261c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).setErrorCode(km1Var.f79471a).setSubErrorCode(km1Var.f79472b).setException(be2Var).build());
                        z11 = true;
                        this.A = true;
                        this.f80272n = null;
                    }
                }
                c10 = '\b';
                i13 = 7;
                this.f80261c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).setErrorCode(km1Var.f79471a).setSubErrorCode(km1Var.f79472b).setException(be2Var).build());
                z11 = true;
                this.A = true;
                this.f80272n = null;
            }
            c10 = '\b';
            i13 = 7;
            i11 = 9;
            i12 = 6;
            this.f80261c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).setErrorCode(km1Var.f79471a).setSubErrorCode(km1Var.f79472b).setException(be2Var).build());
            z11 = true;
            this.A = true;
            this.f80272n = null;
        }
        if (zeVar.a(2)) {
            zn0 zn0Var2 = (zn0) oe2Var;
            zn0Var2.r();
            o83 o83Var = zn0Var2.Z.f76257i.f82910d;
            boolean zA = o83Var.a(2);
            boolean zA2 = o83Var.a(z11 ? 1 : 0);
            boolean zA3 = o83Var.a(3);
            if (zA || zA2 || zA3) {
                if (zA || ib3.a(this.f80276r, (Object) null)) {
                    i18 = 5;
                } else {
                    boolean z15 = this.f80276r == null ? z11 ? 1 : 0 : false;
                    this.f80276r = null;
                    i18 = 5;
                    a(1, jElapsedRealtime, null, z15 ? 1 : 0);
                }
                if (!zA2 && !ib3.a(this.f80277s, (Object) null)) {
                    int i29 = this.f80277s == null ? z11 ? 1 : 0 : 0;
                    this.f80277s = null;
                    a(0, jElapsedRealtime, null, i29);
                }
                if (!zA3 && !ib3.a(this.f80278t, (Object) null)) {
                    ?? r11 = this.f80278t == null ? z11 : 0;
                    this.f80278t = null;
                    a(2, jElapsedRealtime, null, r11);
                }
            } else {
                c10 = c10;
                i13 = i13;
                z11 = z11 ? 1 : 0;
                i18 = 5;
            }
        } else {
            c10 = c10;
            i13 = i13;
            z11 = z11 ? 1 : 0;
            i18 = 5;
        }
        if (a(this.f80273o)) {
            lm1 lm1Var = this.f80273o;
            mx0 mx0Var = lm1Var.f79851a;
            if (mx0Var.f80435s != -1) {
                int i30 = lm1Var.f79852b;
                if (!ib3.a(this.f80276r, mx0Var)) {
                    ?? r12 = (this.f80276r == null && i30 == 0) ? z11 : i30;
                    this.f80276r = mx0Var;
                    a(1, jElapsedRealtime, mx0Var, r12);
                }
                this.f80273o = null;
            }
        }
        if (a(this.f80274p)) {
            lm1 lm1Var2 = this.f80274p;
            mx0 mx0Var2 = lm1Var2.f79851a;
            int i31 = lm1Var2.f79852b;
            if (!ib3.a(this.f80277s, mx0Var2)) {
                ?? r13 = (this.f80277s == null && i31 == 0) ? z11 : i31;
                this.f80277s = mx0Var2;
                a(0, jElapsedRealtime, mx0Var2, r13);
            }
            this.f80274p = null;
        }
        if (a(this.f80275q)) {
            lm1 lm1Var3 = this.f80275q;
            mx0 mx0Var3 = lm1Var3.f79851a;
            int i32 = lm1Var3.f79852b;
            if (!ib3.a(this.f80278t, mx0Var3)) {
                ?? r14 = (this.f80278t == null && i32 == 0) ? z11 : i32;
                this.f80278t = mx0Var3;
                a(2, jElapsedRealtime, mx0Var3, r14);
            }
            this.f80275q = null;
        }
        switch (o82.a(this.f80259a).a()) {
            case 0:
                r10 = 0;
                break;
            case 1:
                r10 = i11;
                break;
            case 2:
                r10 = 2;
                break;
            case 3:
                r10 = 4;
                break;
            case 4:
                r10 = i18;
                break;
            case 5:
                r10 = i12;
                break;
            case 6:
            case 8:
            default:
                r10 = z11;
                break;
            case 7:
                r10 = 3;
                break;
            case 9:
                r10 = c10;
                break;
            case 10:
                r10 = i13;
                break;
        }
        if (r10 != this.f80271m) {
            this.f80271m = r10;
            this.f80261c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(r10).setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).build());
        }
        zn0 zn0Var3 = (zn0) oe2Var;
        zn0Var3.r();
        if (zn0Var3.Z.f76253e != 2) {
            this.f80279u = false;
        }
        zn0Var3.r();
        if (zn0Var3.Z.f76254f == null) {
            this.f80281w = false;
            i19 = 10;
        } else {
            i19 = 10;
            if (zeVar.a(10)) {
                this.f80281w = z11;
            }
        }
        zn0Var3.r();
        int i33 = zn0Var3.Z.f76253e;
        if (this.f80279u) {
            i27 = i18;
        } else if (this.f80281w) {
            i27 = 13;
        } else if (i33 == 4) {
            i27 = 11;
        } else if (i33 == 2) {
            int i34 = this.f80270l;
            if (i34 == 0 || i34 == 2) {
                i27 = 2;
            } else {
                zn0Var3.r();
                if (zn0Var3.Z.f76260l) {
                    zn0Var3.r();
                    if (zn0Var3.Z.f76261m != 0) {
                        i27 = i19;
                    } else {
                        i27 = i12;
                    }
                } else {
                    i27 = i13;
                }
            }
        } else {
            i19 = 3;
            if (i33 == 3) {
                zn0Var3.r();
                if (zn0Var3.Z.f76260l) {
                    zn0Var3.r();
                    if (zn0Var3.Z.f76261m != 0) {
                        i27 = i11;
                    } else {
                        i27 = i19;
                    }
                }
            } else {
                i27 = (i33 != z11 || this.f80270l == 0) ? this.f80270l : 12;
            }
        }
        if (this.f80270l != i27) {
            this.f80270l = i27;
            this.A = z11;
            this.f80261c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f80270l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f80262d).build());
        }
        if (zeVar.a(1028)) {
            oe0 oe0Var2 = this.f80260b;
            ye yeVar3 = (ye) zeVar.f85366b.get(1028);
            yeVar3.getClass();
            oe0Var2.a(yeVar3);
        }
    }

    public final void a(ye yeVar, String str) {
        ym1 ym1Var = yeVar.f84912d;
        if (ym1Var == null || !ym1Var.a()) {
            a();
            this.f80267i = str;
            this.f80268j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            a(yeVar.f84910b, yeVar.f84912d);
        }
    }

    public final void a(int i10, long j10, mx0 mx0Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f80262d);
        if (mx0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            int i12 = 3;
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = i11 != 3 ? 1 : 4;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = mx0Var.f80428l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = mx0Var.f80429m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = mx0Var.f80426j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = mx0Var.f80425i;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = mx0Var.f80434r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = mx0Var.f80435s;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = mx0Var.f80442z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = mx0Var.A;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = mx0Var.f80420d;
            if (str4 != null) {
                int i18 = ib3.f78556a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = mx0Var.f80436t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f80261c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
