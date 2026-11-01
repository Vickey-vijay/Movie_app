package org.fourthline.cling.support.avtransport.lastchange;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.model.PlayMode;
import org.fourthline.cling.support.model.RecordMediumWriteStatus;
import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: loaded from: classes6.dex */
public class AVTransportVariable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Set<Class<? extends ho.b>> f65803a = new HashSet<Class<? extends ho.b>>() { // from class: org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable.1
        {
            add(x.class);
            add(y.class);
            add(t.class);
            add(r.class);
            add(p.class);
            add(f.class);
            add(w.class);
            add(s.class);
            add(g.class);
            add(q.class);
            add(o.class);
            add(h.class);
            add(i.class);
            add(e.class);
            add(j.class);
            add(k.class);
            add(a.class);
            add(m.class);
            add(b.class);
            add(n.class);
            add(l.class);
            add(v.class);
            add(d.class);
            add(u.class);
            add(c.class);
        }
    };

    public static class c extends ho.f {
    }

    public static class d extends ho.f {
    }

    public static class u extends ho.f {
    }

    public static class v extends ho.f {
    }

    public static class a extends ho.g {
        public a(URI uri) {
            super(uri);
        }
    }

    public static class b extends ho.f {
        public b(String str) {
            super(str);
        }
    }

    public static class e extends ho.f {
        public e(String str) {
            super(str);
        }
    }

    public static class f extends ho.c<PlayMode> {
        public f(PlayMode playMode) {
            super(playMode);
        }
    }

    public static class g extends ho.c<RecordQualityMode> {
        public g(RecordQualityMode recordQualityMode) {
            super(recordQualityMode);
        }
    }

    public static class h extends ho.h {
        public h(org.fourthline.cling.model.types.b bVar) {
            super(bVar);
        }
    }

    public static class i extends ho.f {
        public i(String str) {
            super(str);
        }
    }

    public static class j extends ho.f {
        public j(String str) {
            super(str);
        }
    }

    public static class k extends ho.g {
        public k(URI uri) {
            super(uri);
        }
    }

    public static class l extends ho.d<TransportAction> {
        public l(TransportAction[] transportActionArr) {
            super(transportActionArr);
        }
    }

    public static class m extends ho.g {
        public m(URI uri) {
            super(uri);
        }
    }

    public static class n extends ho.f {
        public n(String str) {
            super(str);
        }
    }

    public static class o extends ho.h {
        public o(org.fourthline.cling.model.types.b bVar) {
            super(bVar);
        }
    }

    public static class p extends r {
        public p(StorageMedium[] storageMediumArr) {
            super(storageMediumArr);
        }
    }

    public static class q extends ho.d<RecordQualityMode> {
        public q(RecordQualityMode[] recordQualityModeArr) {
            super(recordQualityModeArr);
        }
    }

    public static class r extends ho.d<StorageMedium> {
        public r(StorageMedium[] storageMediumArr) {
            super(storageMediumArr);
        }
    }

    public static class s extends ho.c<RecordMediumWriteStatus> {
        public s(RecordMediumWriteStatus recordMediumWriteStatus) {
            super(recordMediumWriteStatus);
        }
    }

    public static class t extends ho.c<StorageMedium> {
        public t(StorageMedium storageMedium) {
            super(storageMedium);
        }
    }

    public static class w extends ho.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f65804b = Pattern.compile("^-?\\d+(/\\d+)?$", 2);

        public w(String str) {
            super(str);
            if (f65804b.matcher(str).matches()) {
            } else {
                throw new InvalidValueException("Can't parse TransportPlaySpeed speeds.");
            }
        }
    }

    public static class x extends ho.c<TransportState> {
        public x(TransportState transportState) {
            super(transportState);
        }
    }

    public static class y extends ho.c<TransportStatus> {
        public y(TransportStatus transportStatus) {
            super(transportStatus);
        }
    }
}
