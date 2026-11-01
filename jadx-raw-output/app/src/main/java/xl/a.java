package xl;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import com.ironsource.C3537j8;
import java.util.concurrent.TimeUnit;
import oi.g;

/* JADX INFO: compiled from: ViewAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: xl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewAdapter.java */
    public class C0796a implements g<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ul.b f74974b;

        public C0796a(ul.b bVar) {
            this.f74974b = bVar;
        }

        @Override // oi.g
        public void accept(Object obj) throws Exception {
            ul.b bVar = this.f74974b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: ViewAdapter.java */
    public class b implements g<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ul.b f74975b;

        public b(ul.b bVar) {
            this.f74975b = bVar;
        }

        @Override // oi.g
        public void accept(Object obj) throws Exception {
            ul.b bVar = this.f74975b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: ViewAdapter.java */
    public class c implements g<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ul.b f74976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f74977c;

        public c(ul.b bVar, View view) {
            this.f74976b = bVar;
            this.f74977c = view;
        }

        @Override // oi.g
        public void accept(Object obj) throws Exception {
            ul.b bVar = this.f74976b;
            if (bVar != null) {
                bVar.c(this.f74977c);
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"onClickCommand", "isThrottleFirst"})
    public static void b(View view, ul.b bVar, boolean z10) {
        if (z10) {
            k7.a.a(view).subscribe(new C0796a(bVar));
        } else {
            k7.a.a(view).throttleFirst(200L, TimeUnit.MILLISECONDS).subscribe(new b(bVar));
        }
    }

    @BindingAdapter(requireAll = false, value = {C3537j8.f29257k})
    public static void a(View view, Boolean bool) {
        if (bool.booleanValue()) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @BindingAdapter(requireAll = false, value = {"onLongClickCommand"})
    public static void c(View view, ul.b bVar) {
        k7.a.b(view).subscribe(new c(bVar, view));
    }

    @BindingAdapter(requireAll = false, value = {"textMovement"})
    public static void d(TextView textView, Boolean bool) {
        if (bool.booleanValue()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
