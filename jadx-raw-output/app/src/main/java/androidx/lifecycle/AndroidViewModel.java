package androidx.lifecycle;

import android.app.Application;
import ck.p;

/* JADX INFO: compiled from: AndroidViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        p.j(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t10 = (T) this.application;
        p.h(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
