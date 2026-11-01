package com.bytedance.adsdk.ugeno.pno;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vt {
    private final DataSetObservable ouw = new DataSetObservable();
    private DataSetObserver vt;

    public static Parcelable yu() {
        return null;
    }

    public final void fkw() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.vt;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.ouw.notifyChanged();
    }

    public int lh() {
        return -1;
    }

    public abstract int ouw();

    public final void ouw(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.vt = dataSetObserver;
        }
    }

    public abstract boolean ouw(View view, Object obj);

    public float vt() {
        return 1.0f;
    }

    public Object ouw(ViewGroup viewGroup, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void ouw(ViewGroup viewGroup, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
}
