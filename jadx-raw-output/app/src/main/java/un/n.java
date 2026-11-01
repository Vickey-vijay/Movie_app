package un;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: StateVariableAllowedValueRange.java */
/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f72978d = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f72980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f72981c;

    public long a() {
        return this.f72980b;
    }

    public long b() {
        return this.f72979a;
    }

    public long c() {
        return this.f72981c;
    }

    public List<mn.k> e() {
        return new ArrayList();
    }

    public String toString() {
        return "Range Min: " + b() + " Max: " + a() + " Step: " + c();
    }

    public n(long j10, long j11, long j12) {
        if (j10 > j11) {
            f72978d.warning("UPnP specification violation, allowed value range minimum '" + j10 + "' is greater than maximum '" + j11 + "', switching values.");
            this.f72979a = j11;
            this.f72980b = j10;
        } else {
            this.f72979a = j10;
            this.f72980b = j11;
        }
        this.f72981c = j12;
    }

    public boolean d(long j10) {
        if (j10 >= b() && j10 <= a() && j10 % this.f72981c == 0) {
            return true;
        }
        return false;
    }
}
