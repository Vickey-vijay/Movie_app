package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RxPermissionsFragment extends Fragment {
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private boolean mLogging;
    private Map<String, PublishSubject<Permission>> mSubjects = new HashMap();

    @Override // androidx.fragment.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            zArr[i11] = shouldShowRequestPermissionRationale(strArr[i11]);
        }
        onRequestPermissionsResult(strArr, iArr, zArr);
    }

    public boolean containsByPermission(@NonNull String str) {
        return this.mSubjects.containsKey(str);
    }

    public PublishSubject<Permission> getSubjectByPermission(@NonNull String str) {
        return this.mSubjects.get(str);
    }

    public void log(String str) {
        if (this.mLogging) {
            Log.d(RxPermissions.TAG, str);
        }
    }

    @TargetApi(23)
    public void requestPermissions(@NonNull String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public void setLogging(boolean z10) {
        this.mLogging = z10;
    }

    public void setSubjectForPermission(@NonNull String str, @NonNull PublishSubject<Permission> publishSubject) {
        this.mSubjects.put(str, publishSubject);
    }

    @TargetApi(23)
    public boolean isGranted(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    @TargetApi(23)
    public boolean isRevoked(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void onRequestPermissionsResult(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            log("onRequestPermissionsResult  " + strArr[i10]);
            PublishSubject<Permission> publishSubject = this.mSubjects.get(strArr[i10]);
            if (publishSubject == null) {
                Log.e(RxPermissions.TAG, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.mSubjects.remove(strArr[i10]);
            publishSubject.onNext(new Permission(strArr[i10], iArr[i10] == 0, zArr[i10]));
            publishSubject.onComplete();
        }
    }
}
