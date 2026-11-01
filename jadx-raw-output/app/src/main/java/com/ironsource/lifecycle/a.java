package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29418b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0276a f29419a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0276a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f29418b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f29418b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f29418b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void a(InterfaceC0276a interfaceC0276a) {
        if (interfaceC0276a != null) {
            interfaceC0276a.b(getActivity());
        }
    }

    private void c(InterfaceC0276a interfaceC0276a) {
        if (interfaceC0276a != null) {
            interfaceC0276a.a(getActivity());
        }
    }

    public void d(InterfaceC0276a interfaceC0276a) {
        this.f29419a = interfaceC0276a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f29419a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f29419a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f29419a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f29419a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void b(InterfaceC0276a interfaceC0276a) {
        if (interfaceC0276a != null) {
            interfaceC0276a.onResume(getActivity());
        }
    }
}
