package io.bidmachine.rendering.internal.animation;

import ck.p;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.EventType;
import java.util.List;
import nj.b0;
import nj.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements io.bidmachine.rendering.internal.event.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f60077c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f60078d = r.e(EventType.OnClick);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f60079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bk.a f60080b;

    public c(b bVar, bk.a aVar) {
        p.j(bVar, "animationController");
        this.f60079a = bVar;
        this.f60080b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // io.bidmachine.rendering.internal.event.e
    public boolean a(List list) {
        boolean zA;
        p.j(list, "params");
        Object objI0 = b0.i0(list, 0);
        if (!(objI0 instanceof EventType)) {
            return false;
        }
        boolean z10 = true;
        Object objI1 = b0.i0(list, 1);
        if (!(objI1 instanceof Integer) || !f60078d.contains(objI0)) {
            return false;
        }
        bk.a aVar = this.f60080b;
        Integer num = aVar != null ? (Integer) aVar.invoke() : null;
        if (num == null) {
            zA = false;
        } else {
            Integer num2 = num.intValue() != -1 ? num : null;
            if (num2 != null) {
                zA = this.f60079a.a(num2.intValue());
            } else {
                zA = false;
            }
        }
        boolean zA2 = this.f60079a.a(((Number) objI1).intValue());
        if (!zA && !zA2) {
            z10 = false;
        }
        o.b("AdAnimationEventInterceptor", "Intercept result=" + z10 + "; eventType=" + objI0 + "; viewId=" + objI1, new Object[0]);
        return z10;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }
}
