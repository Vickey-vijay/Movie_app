package zn;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.registry.RegistrationException;
import org.fourthline.cling.transport.RouterException;
import un.i;
import un.j;
import un.k;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: RetrieveRemoteDescriptors.java */
/* JADX INFO: loaded from: classes9.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f86505e = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<URL> f86506f = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn.b f86507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f86508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<z> f86509d = new ArrayList();

    public k d(k kVar) throws RouterException, ValidationException, DescriptorBindingException {
        try {
            URL urlO = kVar.d().O(kVar.o());
            org.fourthline.cling.model.message.b bVar = new org.fourthline.cling.model.message.b(UpnpRequest.Method.GET, urlO);
            pn.c cVarX = g().getConfiguration().x(kVar.d().r());
            if (cVarX != null) {
                bVar.j().putAll(cVarX);
            }
            Logger logger = f86505e;
            logger.fine("Sending service descriptor retrieval message: " + bVar);
            org.fourthline.cling.model.message.c cVarC = g().c().c(bVar);
            if (cVarC == null) {
                logger.warning("Could not retrieve service descriptor, no response: " + kVar);
                return null;
            }
            if (cVarC.k().f()) {
                logger.warning("Service descriptor retrieval failed: " + urlO + ", " + cVarC.k().c());
                return null;
            }
            if (!cVarC.q()) {
                logger.fine("Received service descriptor without or with invalid Content-Type: " + urlO);
            }
            String strD = cVarC.d();
            if (strD == null || strD.length() == 0) {
                logger.warning("Received empty service descriptor:" + urlO);
                return null;
            }
            logger.fine("Received service descriptor, hydrating service model: " + cVarC);
            return (k) g().getConfiguration().c().b(kVar, strD);
        } catch (IllegalArgumentException unused) {
            f86505e.warning("Could not normalize service descriptor URL: " + kVar.o());
            return null;
        }
    }

    public void a() throws RouterException {
        if (g().c() == null) {
            f86505e.warning("Router not yet initialized");
            return;
        }
        try {
            org.fourthline.cling.model.message.b bVar = new org.fourthline.cling.model.message.b(UpnpRequest.Method.GET, this.f86508c.r().d());
            pn.c cVarX = g().getConfiguration().x(this.f86508c.r());
            if (cVarX != null) {
                bVar.j().putAll(cVarX);
            }
            Logger logger = f86505e;
            logger.fine("Sending device descriptor retrieval message: " + bVar);
            org.fourthline.cling.model.message.c cVarC = g().c().c(bVar);
            if (cVarC == null) {
                logger.warning("Device descriptor retrieval failed, no response: " + this.f86508c.r().d());
                return;
            }
            if (cVarC.k().f()) {
                logger.warning("Device descriptor retrieval failed: " + this.f86508c.r().d() + ", " + cVarC.k().c());
                return;
            }
            if (!cVarC.q()) {
                logger.fine("Received device descriptor without or with invalid Content-Type: " + this.f86508c.r().d());
            }
            String strD = cVarC.d();
            if (strD == null || strD.length() == 0) {
                logger.warning("Received empty device descriptor:" + this.f86508c.r().d());
                return;
            }
            logger.fine("Received root device descriptor: " + cVarC);
            c(strD);
        } catch (IllegalArgumentException e10) {
            f86505e.warning("Device descriptor retrieval failed: " + this.f86508c.r().d() + ", possibly invalid URL: " + e10);
        }
    }

    public void c(String str) throws RouterException {
        RegistrationException e10;
        i iVar;
        DescriptorBindingException e11;
        i iVar2 = null;
        try {
            iVar = (i) g().getConfiguration().l().a(this.f86508c, str);
            try {
                Logger logger = f86505e;
                logger.fine("Remote device described (without services) notifying listeners: " + iVar);
                boolean zV = g().getRegistry().v(iVar);
                logger.fine("Hydrating described device's services: " + iVar);
                i iVarE = e(iVar);
                if (iVarE != null) {
                    logger.fine("Adding fully hydrated remote device to registry: " + iVarE);
                    g().getRegistry().k(iVarE);
                    return;
                }
                if (!this.f86509d.contains(this.f86508c.r().b())) {
                    this.f86509d.add(this.f86508c.r().b());
                    logger.warning("Device service description failed: " + this.f86508c);
                }
                if (zV) {
                    g().getRegistry().t(iVar, new DescriptorBindingException("Device service description failed: " + this.f86508c));
                }
            } catch (DescriptorBindingException e12) {
                e11 = e12;
                Logger logger2 = f86505e;
                logger2.warning("Could not hydrate device or its services from descriptor: " + this.f86508c);
                logger2.warning("Cause was: " + so.a.a(e11));
                if (iVar == null || 0 == 0) {
                    return;
                }
                g().getRegistry().t(iVar, e11);
            } catch (ValidationException e13) {
                e = e13;
                iVar2 = iVar;
                if (this.f86509d.contains(this.f86508c.r().b())) {
                    return;
                }
                this.f86509d.add(this.f86508c.r().b());
                f86505e.warning("Could not validate device model: " + this.f86508c);
                Iterator<mn.k> it = e.getErrors().iterator();
                while (it.hasNext()) {
                    f86505e.warning(it.next().toString());
                }
                if (iVar2 == null || 0 == 0) {
                    return;
                }
                g().getRegistry().t(iVar2, e);
            } catch (RegistrationException e14) {
                e10 = e14;
                Logger logger3 = f86505e;
                logger3.warning("Adding hydrated device to registry failed: " + this.f86508c);
                logger3.warning("Cause was: " + e10.toString());
                if (iVar == 0 || 0 == 0) {
                    return;
                }
                g().getRegistry().t(iVar, e10);
            }
        } catch (DescriptorBindingException e15) {
            e11 = e15;
            iVar = null;
        } catch (ValidationException e16) {
            e = e16;
        } catch (RegistrationException e17) {
            e10 = e17;
            iVar = null;
        }
    }

    public i e(i iVar) throws RouterException, ValidationException, DescriptorBindingException {
        i iVarE;
        ArrayList arrayList = new ArrayList();
        if (iVar.y()) {
            for (k kVar : f(iVar.u())) {
                k kVarD = d(kVar);
                if (kVarD != null) {
                    arrayList.add(kVarD);
                } else {
                    f86505e.warning("Skipping invalid service '" + kVar + "' of: " + iVar);
                }
            }
        }
        List<i> arrayList2 = new ArrayList<>();
        if (iVar.w()) {
            for (i iVar2 : iVar.p()) {
                if (iVar2 != null && (iVarE = e(iVar2)) != null) {
                    arrayList2.add(iVarE);
                }
            }
        }
        un.d[] dVarArr = new un.d[iVar.q().length];
        for (int i10 = 0; i10 < iVar.q().length; i10++) {
            dVarArr[i10] = iVar.q()[i10].a();
        }
        return iVar.B(((j) iVar.r()).b(), iVar.v(), iVar.getType(), iVar.m(), dVarArr, iVar.Q(arrayList), arrayList2);
    }

    public fn.b g() {
        return this.f86507b;
    }

    @Override // java.lang.Runnable
    public void run() {
        URL urlD = this.f86508c.r().d();
        Set<URL> set = f86506f;
        if (set.contains(urlD)) {
            f86505e.finer("Exiting early, active retrieval for URL already in progress: " + urlD);
            return;
        }
        if (g().getRegistry().f(this.f86508c.r().b(), true) != null) {
            f86505e.finer("Exiting early, already discovered: " + urlD);
            return;
        }
        try {
            try {
                set.add(urlD);
                a();
            } catch (RouterException e10) {
                f86505e.log(Level.WARNING, "Descriptor retrieval failed: " + urlD, (Throwable) e10);
                set = f86506f;
            }
            set.remove(urlD);
        } catch (Throwable th2) {
            f86506f.remove(urlD);
            throw th2;
        }
    }

    public e(fn.b bVar, i iVar) {
        this.f86507b = bVar;
        this.f86508c = iVar;
    }

    public List<k> f(k[] kVarArr) {
        s[] sVarArrQ = g().getConfiguration().q();
        if (sVarArrQ != null && sVarArrQ.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (k kVar : kVarArr) {
                for (s sVar : sVarArrQ) {
                    if (kVar.g().c(sVar)) {
                        f86505e.fine("Including exclusive service: " + kVar);
                        arrayList.add(kVar);
                    } else {
                        f86505e.fine("Excluding unwanted service: " + sVar);
                    }
                }
            }
            return arrayList;
        }
        return Arrays.asList(kVarArr);
    }
}
