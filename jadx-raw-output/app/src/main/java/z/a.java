package z;

import android.content.Context;
import ck.i;
import ck.p;
import io.g;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: compiled from: AVTransportController.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0805a f85853j = new C0805a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TransportAction[] f85854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TransportAction[] f85855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TransportAction[] f85856m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y.a f85858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.d f85859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.c f85860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v.b f85861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f85862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.b f85863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f85864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f85865i;

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AVTransportController.kt */
    public static final class C0805a {
        public C0805a() {
        }

        public /* synthetic */ C0805a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AVTransportController.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransportState.values().length];
            try {
                iArr[TransportState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransportState.PAUSED_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        TransportAction transportAction = TransportAction.Play;
        f85854k = new TransportAction[]{transportAction};
        TransportAction transportAction2 = TransportAction.Stop;
        TransportAction transportAction3 = TransportAction.Seek;
        f85855l = new TransportAction[]{transportAction2, TransportAction.Pause, transportAction3};
        f85856m = new TransportAction[]{transportAction, transportAction3, transportAction2};
    }

    public a(Context context) {
        p.j(context, "applicationContext");
        this.f85857a = context;
        this.f85859c = new io.d();
        this.f85860d = new io.c();
        this.f85861e = v.b.f73000b.a("AVTransportController");
        this.f85862f = new g();
        this.f85863g = new io.b(new StorageMedium[]{StorageMedium.UNKNOWN});
    }

    @Override // z.f
    public io.c a() {
        return this.f85860d;
    }

    @Override // z.f
    public io.f b() {
        y.a aVar = this.f85858b;
        return aVar != null ? new io.f(aVar.getState().toTransportState(), TransportStatus.OK, "1") : new io.f();
    }

    @Override // z.f
    public g c() {
        return this.f85862f;
    }

    @Override // z.f
    public io.d e() {
        y.a aVar = this.f85858b;
        if (aVar == null) {
            return new io.d();
        }
        long j10 = 1000;
        String strI = mn.f.i(aVar.getDuration() / j10);
        String strI2 = mn.f.i(aVar.getCurrentPosition() / j10);
        return new io.d(0L, strI, this.f85864h, strI2, strI2);
    }

    @Override // z.f
    public io.b f() {
        return this.f85863g;
    }

    public final void g(y.a aVar) {
        if (aVar != null) {
            this.f85860d = new io.c(this.f85864h, this.f85865i);
            this.f85859c = new io.d(0L, this.f85865i, this.f85864h);
        } else {
            y.a aVar2 = this.f85858b;
            if (aVar2 != null) {
                aVar2.stop();
            }
            this.f85860d = new io.c();
            this.f85859c = new io.d();
        }
        this.f85858b = aVar;
    }

    @Override // z.f
    public TransportAction[] d() {
        int i10;
        TransportState transportStateB = b().b();
        if (transportStateB == null) {
            i10 = -1;
        } else {
            i10 = b.$EnumSwitchMapping$0[transportStateB.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return f85854k;
            }
            return f85856m;
        }
        return f85855l;
    }
}
