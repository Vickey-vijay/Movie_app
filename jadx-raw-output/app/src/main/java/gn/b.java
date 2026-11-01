package gn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import mn.f;
import org.eclipse.jetty.util.security.Constraint;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: AndroidRouter.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends mo.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f53632s = Logger.getLogger(mo.a.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f53633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WifiManager f53634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WifiManager.MulticastLock f53635o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WifiManager.WifiLock f53636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public NetworkInfo f53637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BroadcastReceiver f53638r;

    /* JADX INFO: compiled from: AndroidRouter.java */
    public class a extends BroadcastReceiver {
        public boolean b(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
            if (networkInfo == null && networkInfo2 == null) {
                return true;
            }
            return (networkInfo == null || networkInfo2 == null || networkInfo.getType() != networkInfo2.getType()) ? false : true;
        }

        public a() {
        }

        public void a(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            String stringExtra = intent.getStringExtra("reason");
            boolean booleanExtra2 = intent.getBooleanExtra("isFailover", false);
            Object obj = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            Object obj2 = (NetworkInfo) intent.getParcelableExtra("otherNetwork");
            b.f53632s.info("Connectivity change detected...");
            b.f53632s.info("EXTRA_NO_CONNECTIVITY: " + booleanExtra);
            b.f53632s.info("EXTRA_REASON: " + stringExtra);
            b.f53632s.info("EXTRA_IS_FAILOVER: " + booleanExtra2);
            Logger logger = b.f53632s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EXTRA_NETWORK_INFO: ");
            if (obj == null) {
                obj = "none";
            }
            sb2.append(obj);
            logger.info(sb2.toString());
            Logger logger2 = b.f53632s;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("EXTRA_OTHER_NETWORK_INFO: ");
            if (obj2 == null) {
                obj2 = "none";
            }
            sb3.append(obj2);
            logger2.info(sb3.toString());
            b.f53632s.info("EXTRA_EXTRA_INFO: " + intent.getStringExtra("extraInfo"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            a(intent);
            NetworkInfo networkInfoA = e.a(context);
            if (b.this.f53637q != null && networkInfoA == null) {
                for (int i10 = 1; i10 <= 3; i10++) {
                    try {
                        Thread.sleep(1000L);
                        b.f53632s.warning(String.format("%s => NONE network transition, waiting for new network... retry #%d", b.this.f53637q.getTypeName(), Integer.valueOf(i10)));
                        networkInfoA = e.a(context);
                        if (networkInfoA != null) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
            if (b(b.this.f53637q, networkInfoA)) {
                b.f53632s.info("No actual network change... ignoring event!");
                return;
            }
            try {
                b bVar = b.this;
                bVar.s(bVar.f53637q, networkInfoA);
            } catch (RouterException e10) {
                b.this.q(e10);
            }
        }
    }

    @Override // mo.b
    public int h() {
        return 15000;
    }

    @Override // mo.b, mo.a
    public boolean enable() throws RouterException {
        j(this.f64657f);
        try {
            boolean zEnable = super.enable();
            if (zEnable && r()) {
                t(true);
                u(true);
            }
            return zEnable;
        } finally {
            n(this.f64657f);
        }
    }

    @Override // mo.b
    public boolean g() throws RouterException {
        j(this.f64657f);
        try {
            if (r()) {
                t(false);
                u(false);
            }
            return super.g();
        } finally {
            n(this.f64657f);
        }
    }

    public BroadcastReceiver p() {
        return new a();
    }

    public boolean r() {
        return e.c(this.f53637q);
    }

    public void s(NetworkInfo networkInfo, NetworkInfo networkInfo2) throws RouterException {
        Logger logger = f53632s;
        Object[] objArr = new Object[2];
        objArr[0] = networkInfo == null ? "" : networkInfo.getTypeName();
        String typeName = Constraint.NONE;
        objArr[1] = networkInfo2 == null ? Constraint.NONE : networkInfo2.getTypeName();
        logger.info(String.format("Network type changed %s => %s", objArr));
        if (g()) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = networkInfo == null ? Constraint.NONE : networkInfo.getTypeName();
            logger.info(String.format("Disabled router on network type change (old network: %s)", objArr2));
        }
        this.f53637q = networkInfo2;
        if (enable()) {
            Object[] objArr3 = new Object[1];
            if (networkInfo2 != null) {
                typeName = networkInfo2.getTypeName();
            }
            objArr3[0] = typeName;
            logger.info(String.format("Enabled router on network type change (new network: %s)", objArr3));
        }
    }

    public void t(boolean z10) {
        if (this.f53635o == null) {
            this.f53635o = this.f53634n.createMulticastLock(getClass().getSimpleName());
        }
        if (z10) {
            if (this.f53635o.isHeld()) {
                f53632s.warning("WiFi multicast lock already acquired");
                return;
            } else {
                f53632s.info("WiFi multicast lock acquired");
                this.f53635o.acquire();
                return;
            }
        }
        if (!this.f53635o.isHeld()) {
            f53632s.warning("WiFi multicast lock already released");
        } else {
            f53632s.info("WiFi multicast lock released");
            this.f53635o.release();
        }
    }

    public void u(boolean z10) {
        if (this.f53636p == null) {
            this.f53636p = this.f53634n.createWifiLock(3, getClass().getSimpleName());
        }
        if (z10) {
            if (this.f53636p.isHeld()) {
                f53632s.warning("WiFi lock already acquired");
                return;
            } else {
                f53632s.info("WiFi lock acquired");
                this.f53636p.acquire();
                return;
            }
        }
        if (!this.f53636p.isHeld()) {
            f53632s.warning("WiFi lock already released");
        } else {
            f53632s.info("WiFi lock released");
            this.f53636p.release();
        }
    }

    public void v() {
        BroadcastReceiver broadcastReceiver = this.f53638r;
        if (broadcastReceiver != null) {
            this.f53633m.unregisterReceiver(broadcastReceiver);
            this.f53638r = null;
        }
    }

    public b(fn.c cVar, zn.a aVar, Context context) throws InitializationException {
        super(cVar, aVar);
        this.f53633m = context;
        this.f53634n = (WifiManager) context.getSystemService("wifi");
        this.f53637q = e.a(context);
        if (!f.f64632b) {
            BroadcastReceiver broadcastReceiverP = p();
            this.f53638r = broadcastReceiverP;
            context.registerReceiver(broadcastReceiverP, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void q(RouterException routerException) {
        Throwable thA = so.a.a(routerException);
        if (thA instanceof InterruptedException) {
            f53632s.log(Level.INFO, "Router was interrupted: " + routerException, thA);
            return;
        }
        f53632s.log(Level.WARNING, "Router error on network change: " + routerException, (Throwable) routerException);
    }

    @Override // mo.b, mo.a
    public void shutdown() throws RouterException {
        super.shutdown();
        v();
    }
}
