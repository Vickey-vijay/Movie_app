package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import com.mgs.carparking.ui.mine.languageswitching.LanguageSwitchingDialog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import sa.o0;
import sa.t;

/* JADX INFO: loaded from: classes11.dex */
public class LanguageSwitchingDialog extends AppCompatDialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f42117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<Object> f42118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f42119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f42120f;

    public class a implements LanguageSwitchAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42121a;

        public a(List list) {
            this.f42121a = list;
        }

        @Override // com.mgs.carparking.ui.mine.languageswitching.LanguageSwitchAdapter.c
        public void a(int i10) {
            LanguageSwitchingDialog.this.dismiss();
            b bVar = LanguageSwitchingDialog.this.f42120f;
            if (bVar != null) {
                bVar.a(((SetLanguageEntry) this.f42121a.get(i10)).getName());
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public void e(b bVar) {
        this.f42120f = bVar;
    }

    public List<SetLanguageEntry> g() {
        ArrayList arrayList = new ArrayList();
        if (Objects.equals(o0.s(), "none")) {
            return new ArrayList();
        }
        String strS = o0.s();
        Objects.requireNonNull(strS);
        for (String str : strS.split(StringUtils.COMMA)) {
            arrayList.add(new SetLanguageEntry(str, t.a(str), false));
        }
        arrayList.removeIf(new Predicate() { // from class: na.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LanguageSwitchingDialog.c((SetLanguageEntry) obj);
            }
        });
        String strM = o0.m();
        Objects.requireNonNull(strM);
        arrayList.add(0, new SetLanguageEntry(strM, t.a(o0.m()), true));
        return arrayList;
    }

    public LanguageSwitchingDialog(Context context) {
        super(context, R.style.dialog_center);
        this.f42118d = new ArrayList<>();
        requestWindowFeature(1);
        this.f42117c = context;
    }

    public static /* synthetic */ boolean c(SetLanguageEntry setLanguageEntry) {
        return setLanguageEntry.getName().equals(o0.m());
    }

    public final void d(View view) {
        this.f42116b = (TextView) view.findViewById(R.id.tv_cancel);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_language);
        this.f42119e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f42117c));
        List<SetLanguageEntry> listG = g();
        LanguageSwitchAdapter languageSwitchAdapter = new LanguageSwitchAdapter(this.f42117c, listG);
        this.f42119e.setAdapter(languageSwitchAdapter);
        languageSwitchAdapter.d(new a(listG));
    }

    public final void f() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42117c, R.layout.dialog_language_switching, null);
        d(viewGroup);
        setContentView(viewGroup);
        f();
    }
}
