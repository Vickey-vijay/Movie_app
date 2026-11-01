package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.r;
import fm.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import ul.b;
import w9.v1;

/* JADX INFO: loaded from: classes2.dex */
public class HISTORYVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableBoolean f41206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f41207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<VideoLookHistoryEntry> f41208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<VideoLookHistoryEntry> f41209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableArrayList<v1> f41210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableArrayList<v1> f41211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c<v1> f41212u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f41213v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f41214w;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        for (v1 v1Var : this.f41210s) {
            this.f41211t.remove(v1Var);
            VideoLookHistoryDao.getInstance().deleteHistory(v1Var.f73824b);
        }
        if (this.f41211t.size() == 0) {
            this.f42196i.set(false);
            this.f41206o.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (!this.f41207p.get().equals(r.a().getResources().getString(R.string.text_all_select))) {
            Iterator<v1> it = this.f41211t.iterator();
            while (it.hasNext()) {
                it.next().f73826d.set(Boolean.FALSE);
                this.f41210s.clear();
            }
            this.f41207p.set(r.a().getResources().getString(R.string.text_all_select));
            return;
        }
        for (v1 v1Var : this.f41211t) {
            v1Var.f73826d.set(Boolean.TRUE);
            this.f41210s.add(v1Var);
        }
        this.f41207p.set(r.a().getResources().getString(R.string.text_unall_select));
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        if (!this.f41206o.get()) {
            this.f42198k.set(ContextCompat.getDrawable(getApplication(), R.drawable.ic_edit_close));
            this.f41206o.set(true);
            return;
        }
        this.f41206o.set(false);
        this.f41210s.clear();
        this.f42198k.set(ContextCompat.getDrawable(getApplication(), R.drawable.ic_edits));
        Iterator<v1> it = this.f41211t.iterator();
        while (it.hasNext()) {
            it.next().f73826d.set(Boolean.FALSE);
        }
    }

    public void p(VideoLookHistoryEntry videoLookHistoryEntry) {
        this.f41208q.setValue(videoLookHistoryEntry);
    }

    public HISTORYVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41206o = new ObservableBoolean(false);
        this.f41207p = new ObservableField<>(r.a().getResources().getString(R.string.text_all_select));
        this.f41208q = new SingleLiveEvent<>();
        this.f41209r = new ArrayList();
        this.f41210s = new ObservableArrayList<>();
        this.f41211t = new ObservableArrayList<>();
        this.f41212u = c.c(7, R.layout.item_mine_history);
        this.f41213v = new b(new ul.a() { // from class: w9.h0
            @Override // ul.a
            public final void call() {
                this.f73634a.q();
            }
        });
        this.f41214w = new b(new ul.a() { // from class: w9.i0
            @Override // ul.a
            public final void call() {
                this.f73642a.r();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.text_mine_history));
        this.f42196i.set(true);
    }

    public void s() {
        ArrayList<VideoLookHistoryEntry> arrayListQueryHistory = VideoLookHistoryDao.getInstance().queryHistory();
        this.f41209r = arrayListQueryHistory;
        if (arrayListQueryHistory.size() == 0) {
            this.f42196i.set(false);
        } else {
            this.f42196i.set(true);
            this.f42195h.set("");
            this.f42198k.set(ContextCompat.getDrawable(getApplication(), R.drawable.ic_edits));
        }
        this.f41211t.clear();
        Iterator<VideoLookHistoryEntry> it = this.f41209r.iterator();
        while (it.hasNext()) {
            this.f41211t.add(new v1(this, it.next()));
        }
    }
}
