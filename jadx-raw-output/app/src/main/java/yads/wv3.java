package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class wv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia f84351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha f84352b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vv3 f84354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ka f84355e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f84358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f84359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f84360j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx3 f84353c = new dx3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84356f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84357g = false;

    public final void a(View view, yx0 yx0Var, String str) {
        xw3 xw3Var;
        if (this.f84357g) {
            return;
        }
        dx3 dx3Var = this.f84353c;
        dx3Var.getClass();
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!dx3.f76840b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = dx3Var.f76841a.iterator();
        do {
            if (!it.hasNext()) {
                xw3Var = null;
                break;
            }
            xw3Var = (xw3) it.next();
        } while (xw3Var.f84729a.get() != view);
        if (xw3Var == null) {
            dx3Var.f76841a.add(new xw3(view, yx0Var, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f84357g) {
            return;
        }
        this.f84354d.clear();
        if (!this.f84357g) {
            this.f84353c.f76841a.clear();
        }
        this.f84357g = true;
        ka kaVar = this.f84355e;
        ix3.f78850a.a((WebView) kaVar.f79343b.get(), "finishSession", kaVar.f79342a);
        nw3 nw3Var = nw3.f80846c;
        boolean z10 = nw3Var.f80848b.size() > 0;
        nw3Var.f80847a.remove(this);
        nw3Var.f80848b.remove(this);
        if (z10 && nw3Var.f80848b.size() <= 0) {
            jx3 jx3VarA = jx3.a();
            jx3VarA.getClass();
            x83 x83Var = x83.f84484g;
            x83Var.getClass();
            Handler handler = x83.f84486i;
            if (handler != null) {
                handler.removeCallbacks(x83.f84488k);
                x83.f84486i = null;
            }
            x83Var.f84489a.clear();
            x83.f84485h.post(new u83(x83Var));
            bw3 bw3Var = bw3.f75999d;
            bw3Var.f82447a = false;
            bw3Var.f82449c = null;
            vw3 vw3Var = jx3VarA.f79235d;
            vw3Var.f84032b.getContentResolver().unregisterContentObserver(vw3Var);
        }
        this.f84355e.b();
        this.f84355e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        if (this.f84356f || this.f84355e == null) {
            return;
        }
        this.f84356f = true;
        nw3 nw3Var = nw3.f80846c;
        boolean z10 = nw3Var.f80848b.size() > 0;
        nw3Var.f80848b.add(this);
        if (!z10) {
            jx3 jx3VarA = jx3.a();
            jx3VarA.getClass();
            bw3 bw3Var = bw3.f75999d;
            bw3Var.f82449c = jx3VarA;
            bw3Var.b();
            x83.f84484g.getClass();
            if (x83.f84486i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                x83.f84486i = handler;
                handler.post(x83.f84487j);
                x83.f84486i.postDelayed(x83.f84488k, 200L);
            }
            vw3 vw3Var = jx3VarA.f79235d;
            vw3Var.f84038h.submit(new qw3(vw3Var));
            vw3Var.f84032b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, vw3Var);
        }
        float f10 = jx3.a().f79232a;
        ka kaVar = this.f84355e;
        ix3 ix3Var = ix3.f78850a;
        ix3Var.a((WebView) kaVar.f79343b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f79342a);
        ka kaVar2 = this.f84355e;
        Date date = pv3.f81620f.f81622b;
        Date date2 = date != null ? (Date) date.clone() : null;
        kaVar2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            lw3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            ix3Var.a((WebView) kaVar2.f79343b.get(), "setLastActivity", jSONObject);
        }
        this.f84355e.a(this, this.f84351a);
    }

    public wv3(ha haVar, ia iaVar, String str) {
        ka rv3Var;
        this.f84352b = haVar;
        this.f84351a = iaVar;
        this.f84358h = str;
        a();
        if (iaVar.a() != ja.f78954c && iaVar.a() != ja.f78956e) {
            rv3Var = new dw3(str, iaVar.c(), iaVar.b());
        } else {
            rv3Var = new rv3(iaVar.d(), str);
        }
        this.f84355e = rv3Var;
        this.f84355e.c();
        nw3.a().a(this);
        this.f84355e.a(haVar);
    }

    public final void a() {
        this.f84354d = new vv3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f84357g || ((View) this.f84354d.get()) == view) {
            return;
        }
        this.f84354d = new vv3(view);
        this.f84355e.a();
        Collection<wv3> collectionUnmodifiableCollection = Collections.unmodifiableCollection(nw3.f80846c.f80847a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (wv3 wv3Var : collectionUnmodifiableCollection) {
            if (wv3Var != this && ((View) wv3Var.f84354d.get()) == view) {
                wv3Var.f84354d.clear();
            }
        }
    }
}
