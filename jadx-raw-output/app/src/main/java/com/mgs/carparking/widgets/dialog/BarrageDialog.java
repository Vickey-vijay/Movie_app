package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.fvvcl.flickverse.R;
import sa.s;

/* JADX INFO: loaded from: classes7.dex */
public class BarrageDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f42393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f42394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f42395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f42396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f42397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputMethodManager f42398h;

    public class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BarrageDialog.this.f42394d.setFocusableInTouchMode(true);
            BarrageDialog.this.f42394d.requestFocus();
            ((InputMethodManager) BarrageDialog.this.f42394d.getContext().getSystemService("input_method")).showSoftInput(BarrageDialog.this.f42394d, 1);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            BarrageDialog.this.f42398h.showSoftInput(view, 2);
            return false;
        }
    }

    public class c implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BarrageDialog.this.f42395e.setText((20 - editable.length()) + "");
            if (editable.length() > 0) {
                BarrageDialog.this.f42396f.setEnabled(true);
                BarrageDialog.this.f42396f.setTextColor(BarrageDialog.this.f42392b.getResources().getColor(R.color.white));
                BarrageDialog.this.f42396f.setBackground(BarrageDialog.this.f42392b.getResources().getDrawable(R.drawable.shape_video_barrage_submit_green));
            } else {
                BarrageDialog.this.f42396f.setEnabled(false);
                BarrageDialog.this.f42396f.setTextColor(BarrageDialog.this.f42392b.getResources().getColor(R.color.color_ededed));
                BarrageDialog.this.f42396f.setBackground(BarrageDialog.this.f42392b.getResources().getDrawable(R.drawable.shape_video_barrage_submit));
            }
        }
    }

    public interface d {
        void a(String str);
    }

    public void i(d dVar) {
        this.f42397g = dVar;
    }

    public BarrageDialog(Context context, Activity activity) {
        super(context, R.style.dialog_center1);
        requestWindowFeature(1);
        this.f42392b = context;
        this.f42393c = activity;
    }

    public final void g(View view) {
        this.f42394d = (EditText) view.findViewById(R.id.et_input);
        this.f42395e = (TextView) view.findViewById(R.id.tv_et_num);
        Button button = (Button) view.findViewById(R.id.bt_submit);
        this.f42396f = button;
        button.setOnClickListener(this);
    }

    public final void h(View view) {
        getWindow().setGravity(80);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        getWindow().setSoftInputMode(4);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.bt_submit) {
            String strTrim = this.f42394d.getText().toString().trim();
            s.c(this.f42394d);
            d dVar = this.f42397g;
            if (dVar != null) {
                dVar.a(strTrim);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42392b, R.layout.dialog_video_barrage, null);
        g(viewGroup);
        setContentView(viewGroup);
        h(viewGroup);
        setOnShowListener(new a());
        this.f42398h = (InputMethodManager) this.f42392b.getSystemService("input_method");
        this.f42394d.setOnTouchListener(new b());
        this.f42394d.addTextChangedListener(new c());
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
