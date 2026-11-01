package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.mgs.carparking.netbean.DetailsetAudioandSubtitleEntry;
import em.o;
import java.util.ArrayList;
import java.util.List;
import sa.t;

/* JADX INFO: compiled from: DetailSetAudioPop.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f42594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DetailsetAudioandSubtitleAdapter f42595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DetailsetAudioandSubtitleAdapter f42596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f42597e;

    /* JADX INFO: compiled from: DetailSetAudioPop.java */
    public class a implements DetailsetAudioandSubtitleAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t.a f42599b;

        public a(List list, t.a aVar) {
            this.f42598a = list;
            this.f42599b = aVar;
        }

        @Override // com.mgs.carparking.widgets.dialog.DetailsetAudioandSubtitleAdapter.c
        public void a(int i10) {
            b.this.f42595c.g(this.f42598a, i10);
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) this.f42599b.D().Q();
            defaultTrackSelector.L(defaultTrackSelector.v().f().i(((DetailsetAudioandSubtitleEntry) this.f42598a.get(i10)).getName()));
            c cVar = b.this.f42597e;
            if (cVar != null) {
                cVar.b(((DetailsetAudioandSubtitleEntry) this.f42598a.get(i10)).getName());
            }
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DetailSetAudioPop.java */
    public class C0427b implements DetailsetAudioandSubtitleAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t.a f42602b;

        public C0427b(List list, t.a aVar) {
            this.f42601a = list;
            this.f42602b = aVar;
        }

        @Override // com.mgs.carparking.widgets.dialog.DetailsetAudioandSubtitleAdapter.c
        public void a(int i10) {
            b.this.f42596d.g(this.f42601a, i10);
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) this.f42602b.D().Q();
            defaultTrackSelector.L(defaultTrackSelector.v().f().j(((DetailsetAudioandSubtitleEntry) this.f42601a.get(i10)).getName()));
            c cVar = b.this.f42597e;
            if (cVar != null) {
                cVar.a(((DetailsetAudioandSubtitleEntry) this.f42601a.get(i10)).getName());
            }
        }
    }

    /* JADX INFO: compiled from: DetailSetAudioPop.java */
    public interface c {
        void a(String str);

        void b(String str);
    }

    public boolean a(List<DetailsetAudioandSubtitleEntry> list, DetailsetAudioandSubtitleEntry detailsetAudioandSubtitleEntry) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getName().equals(detailsetAudioandSubtitleEntry.getName())) {
                return true;
            }
        }
        return false;
    }

    public b(Context context, t.a aVar, String str, String str2) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_detail_set_audio_subtitles, (ViewGroup) null);
        this.f42593a = (RecyclerView) viewInflate.findViewById(R.id.rv_list_audio);
        this.f42594b = (RecyclerView) viewInflate.findViewById(R.id.rv_list_subtitles);
        this.f42593a.setLayoutManager(new LinearLayoutManager(context));
        this.f42594b.setLayoutManager(new LinearLayoutManager(context));
        DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) aVar.D().Q();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = true;
        int i10 = 0;
        if (str2.equals(context.getString(R.string.str_subtitles_nothing))) {
            arrayList2.add(new DetailsetAudioandSubtitleEntry(1000, context.getString(R.string.str_subtitles_nothing), context.getString(R.string.str_subtitles_nothing), true));
        } else {
            arrayList2.add(new DetailsetAudioandSubtitleEntry(1000, context.getString(R.string.str_subtitles_nothing), context.getString(R.string.str_subtitles_nothing), false));
        }
        com.google.android.exoplayer2.trackselection.b.a aVarG = defaultTrackSelector.g();
        if (aVarG != null) {
            int i11 = 0;
            while (i11 < aVarG.c()) {
                TrackGroupArray trackGroupArrayE = aVarG.e(i11);
                if (z10 == aVarG.d(i11)) {
                    int i12 = i10;
                    while (i12 < trackGroupArrayE.f19435b) {
                        TrackGroup trackGroupA = trackGroupArrayE.a(i12);
                        Log.d("checkAudio", trackGroupA.a(i10).toString());
                        String str3 = trackGroupA.a(i10).B;
                        if (!o.b(str3)) {
                            DetailsetAudioandSubtitleEntry detailsetAudioandSubtitleEntry = str.equals(str3) ? new DetailsetAudioandSubtitleEntry(i12, str3, t.a(str3), z10) : new DetailsetAudioandSubtitleEntry(i12, str3, t.a(str3), false);
                            if (!a(arrayList, detailsetAudioandSubtitleEntry)) {
                                arrayList.add(detailsetAudioandSubtitleEntry);
                            }
                        }
                        i12++;
                        z10 = true;
                        i10 = 0;
                    }
                } else if (3 == aVarG.d(i11)) {
                    for (int i13 = 0; i13 < trackGroupArrayE.f19435b; i13++) {
                        TrackGroup trackGroupA2 = trackGroupArrayE.a(i13);
                        Log.d("checkSubTitle", trackGroupA2.a(0).toString());
                        String str4 = trackGroupA2.a(0).B;
                        if (!o.b(str4)) {
                            DetailsetAudioandSubtitleEntry detailsetAudioandSubtitleEntry2 = str2.equals(str4) ? new DetailsetAudioandSubtitleEntry(i13, str4, t.a(str4), true) : new DetailsetAudioandSubtitleEntry(i13, str4, t.a(str4), false);
                            if (!a(arrayList2, detailsetAudioandSubtitleEntry2)) {
                                arrayList2.add(detailsetAudioandSubtitleEntry2);
                            }
                        }
                    }
                }
                i11++;
                z10 = true;
                i10 = 0;
            }
        }
        DetailsetAudioandSubtitleAdapter detailsetAudioandSubtitleAdapter = new DetailsetAudioandSubtitleAdapter(context, arrayList);
        this.f42595c = detailsetAudioandSubtitleAdapter;
        this.f42593a.setAdapter(detailsetAudioandSubtitleAdapter);
        this.f42595c.f(new a(arrayList, aVar));
        DetailsetAudioandSubtitleAdapter detailsetAudioandSubtitleAdapter2 = new DetailsetAudioandSubtitleAdapter(context, arrayList2);
        this.f42596d = detailsetAudioandSubtitleAdapter2;
        this.f42594b.setAdapter(detailsetAudioandSubtitleAdapter2);
        this.f42596d.f(new C0427b(arrayList2, aVar));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
    }

    public void b(c cVar) {
        this.f42597e = cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
