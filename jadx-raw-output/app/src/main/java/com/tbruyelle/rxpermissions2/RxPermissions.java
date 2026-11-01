package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import ii.k;
import ii.p;
import ii.q;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oi.o;

/* JADX INFO: loaded from: classes4.dex */
public class RxPermissions {
    public static final String TAG = "RxPermissions";
    public static final Object TRIGGER = new Object();

    @VisibleForTesting
    public Lazy<RxPermissionsFragment> mRxPermissionsFragment;

    @FunctionalInterface
    public interface Lazy<V> {
        V get();
    }

    public RxPermissions(@NonNull FragmentActivity fragmentActivity) {
        this.mRxPermissionsFragment = getLazySingleton(fragmentActivity.getSupportFragmentManager());
    }

    private k<?> pending(String... strArr) {
        for (String str : strArr) {
            if (!this.mRxPermissionsFragment.get().containsByPermission(str)) {
                return k.empty();
            }
        }
        return k.just(TRIGGER);
    }

    @TargetApi(23)
    private boolean shouldShowRequestPermissionRationaleImplementation(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (!isGranted(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean isMarshmallow() {
        return true;
    }

    public k<Boolean> request(String... strArr) {
        return k.just(TRIGGER).compose(ensure(strArr));
    }

    private RxPermissionsFragment findRxPermissionsFragment(@NonNull FragmentManager fragmentManager) {
        return (RxPermissionsFragment) fragmentManager.findFragmentByTag(TAG);
    }

    @NonNull
    private Lazy<RxPermissionsFragment> getLazySingleton(@NonNull final FragmentManager fragmentManager) {
        return new Lazy<RxPermissionsFragment>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.1
            private RxPermissionsFragment rxPermissionsFragment;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tbruyelle.rxpermissions2.RxPermissions.Lazy
            public synchronized RxPermissionsFragment get() {
                if (this.rxPermissionsFragment == null) {
                    this.rxPermissionsFragment = RxPermissions.this.getRxPermissionsFragment(fragmentManager);
                }
                return this.rxPermissionsFragment;
            }
        };
    }

    private k<?> oneOf(k<?> kVar, k<?> kVar2) {
        return kVar == null ? k.just(TRIGGER) : k.merge(kVar, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k<Permission> request(k<?> kVar, final String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return oneOf(kVar, pending(strArr)).flatMap(new o<Object, k<Permission>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // oi.o
            public k<Permission> apply(Object obj) {
                return RxPermissions.this.requestImplementation(strArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public k<Permission> requestImplementation(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.mRxPermissionsFragment.get().log("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(k.just(new Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(k.just(new Permission(str, false, false)));
            } else {
                PublishSubject<Permission> subjectByPermission = this.mRxPermissionsFragment.get().getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = PublishSubject.d();
                    this.mRxPermissionsFragment.get().setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            requestPermissionsFromFragment((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return k.concat(k.fromIterable(arrayList));
    }

    public <T> q<T, Boolean> ensure(final String... strArr) {
        return new q<T, Boolean>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.2
            @Override // ii.q
            public p<Boolean> apply(k<T> kVar) {
                return RxPermissions.this.request(kVar, strArr).buffer(strArr.length).flatMap(new o<List<Permission>, p<Boolean>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.2.1
                    @Override // oi.o
                    public p<Boolean> apply(List<Permission> list) {
                        if (list.isEmpty()) {
                            return k.empty();
                        }
                        Iterator<Permission> it = list.iterator();
                        while (it.hasNext()) {
                            if (!it.next().granted) {
                                return k.just(Boolean.FALSE);
                            }
                        }
                        return k.just(Boolean.TRUE);
                    }
                });
            }
        };
    }

    public <T> q<T, Permission> ensureEach(final String... strArr) {
        return new q<T, Permission>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.3
            @Override // ii.q
            public p<Permission> apply(k<T> kVar) {
                return RxPermissions.this.request(kVar, strArr);
            }
        };
    }

    public <T> q<T, Permission> ensureEachCombined(final String... strArr) {
        return new q<T, Permission>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.4
            @Override // ii.q
            public p<Permission> apply(k<T> kVar) {
                return RxPermissions.this.request(kVar, strArr).buffer(strArr.length).flatMap(new o<List<Permission>, p<Permission>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.4.1
                    @Override // oi.o
                    public p<Permission> apply(List<Permission> list) {
                        return list.isEmpty() ? k.empty() : k.just(new Permission(list));
                    }
                });
            }
        };
    }

    public void onRequestPermissionsResult(String[] strArr, int[] iArr) {
        this.mRxPermissionsFragment.get().onRequestPermissionsResult(strArr, iArr, new boolean[strArr.length]);
    }

    public k<Permission> requestEach(String... strArr) {
        return k.just(TRIGGER).compose(ensureEach(strArr));
    }

    public k<Permission> requestEachCombined(String... strArr) {
        return k.just(TRIGGER).compose(ensureEachCombined(strArr));
    }

    @TargetApi(23)
    public void requestPermissionsFromFragment(String[] strArr) {
        this.mRxPermissionsFragment.get().log("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.mRxPermissionsFragment.get().requestPermissions(strArr);
    }

    public void setLogging(boolean z10) {
        this.mRxPermissionsFragment.get().setLogging(z10);
    }

    public RxPermissions(@NonNull Fragment fragment) {
        this.mRxPermissionsFragment = getLazySingleton(fragment.getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RxPermissionsFragment getRxPermissionsFragment(@NonNull FragmentManager fragmentManager) {
        boolean z10;
        RxPermissionsFragment rxPermissionsFragmentFindRxPermissionsFragment = findRxPermissionsFragment(fragmentManager);
        if (rxPermissionsFragmentFindRxPermissionsFragment == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
            fragmentManager.beginTransaction().add(rxPermissionsFragment, TAG).commitNow();
            return rxPermissionsFragment;
        }
        return rxPermissionsFragmentFindRxPermissionsFragment;
    }

    public boolean isGranted(String str) {
        if (isMarshmallow() && !this.mRxPermissionsFragment.get().isGranted(str)) {
            return false;
        }
        return true;
    }

    public boolean isRevoked(String str) {
        if (isMarshmallow() && this.mRxPermissionsFragment.get().isRevoked(str)) {
            return true;
        }
        return false;
    }

    public k<Boolean> shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        if (!isMarshmallow()) {
            return k.just(Boolean.FALSE);
        }
        return k.just(Boolean.valueOf(shouldShowRequestPermissionRationaleImplementation(activity, strArr)));
    }
}
