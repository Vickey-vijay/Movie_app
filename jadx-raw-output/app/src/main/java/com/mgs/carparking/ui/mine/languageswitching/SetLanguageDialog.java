package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.os.LocaleListCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import com.mgs.carparking.ui.mine.languageswitching.SetLanguageDialog;
import em.r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import sa.c;
import sa.g;
import sa.o0;
import sa.t;

/* JADX INFO: loaded from: classes10.dex */
public class SetLanguageDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f42134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f42135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<Object> f42137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SetLanguageAdapter f42138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f42139h;

    public class a implements SetLanguageAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42140a;

        public a(List list) {
            this.f42140a = list;
        }

        @Override // com.mgs.carparking.ui.mine.languageswitching.SetLanguageAdapter.c
        public void a(int i10) {
            SetLanguageDialog.this.f42138g.g(this.f42140a, i10);
            SetLanguageDialog.this.f42136e = ((SetLanguageEntry) this.f42140a.get(i10)).getName();
        }
    }

    public List<SetLanguageEntry> f() {
        ArrayList arrayList = new ArrayList();
        if (Objects.equals(o0.s(), "none")) {
            return new ArrayList();
        }
        String strS = o0.s();
        Objects.requireNonNull(strS);
        for (String str : strS.split(StringUtils.COMMA)) {
            arrayList.add(new SetLanguageEntry(str, t.a(str), false));
        }
        if (arrayList.removeIf(new Predicate() { // from class: na.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SetLanguageDialog.c((SetLanguageEntry) obj);
            }
        })) {
            String strC = r.c();
            Objects.requireNonNull(strC);
            arrayList.add(0, new SetLanguageEntry(strC, t.a(r.c()), true));
            this.f42136e = r.c();
        } else if (!arrayList.isEmpty()) {
            ((SetLanguageEntry) arrayList.get(0)).setSelector(true);
            this.f42136e = ((SetLanguageEntry) arrayList.get(0)).getName();
        }
        return arrayList;
    }

    public SetLanguageDialog(Context context) {
        super(context, R.style.dialog_center);
        this.f42136e = "hi";
        this.f42137f = new ArrayList<>();
        requestWindowFeature(1);
        this.f42135d = context;
    }

    public static /* synthetic */ boolean c(SetLanguageEntry setLanguageEntry) {
        return setLanguageEntry.getName().equals(r.c());
    }

    public final void d(View view) {
        this.f42133b = (TextView) view.findViewById(R.id.tv_cancel);
        this.f42134c = (TextView) view.findViewById(R.id.tv_save);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_language);
        this.f42139h = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f42135d));
        List<SetLanguageEntry> listF = f();
        SetLanguageAdapter setLanguageAdapter = new SetLanguageAdapter(this.f42135d, listF);
        this.f42138g = setLanguageAdapter;
        this.f42139h.setAdapter(setLanguageAdapter);
        this.f42138g.f(new a(listF));
        this.f42133b.setOnClickListener(this);
        this.f42134c.setOnClickListener(this);
    }

    public final void e() {
        getWindow().setGravity(17);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.tv_cancel) {
            if (id2 == R.id.tv_save) {
                o0.X0(1);
                o0.r0(this.f42136e);
                c.f("");
                g.f("CACHE_HOME_TITLE_LIST", this.f42137f);
                g.f("CACHE_RANK_TITLE_LIST", this.f42137f);
                g.f("CACHE_RANK_MODEL_LIST", this.f42137f);
                AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(this.f42136e));
                dismiss();
                return;
            }
            return;
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42135d, R.layout.dialog_language_set, null);
        d(viewGroup);
        setContentView(viewGroup);
        e();
    }
}
