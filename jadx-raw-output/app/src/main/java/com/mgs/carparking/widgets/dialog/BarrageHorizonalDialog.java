package com.mgs.carparking.widgets.dialog;

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
import androidx.appcompat.app.AppCompatDialog;
import com.fvvcl.flickverse.R;
import sa.s;

/* JADX INFO: loaded from: classes6.dex */
public class BarrageHorizonalDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f42403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f42404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f42405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f42406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputMethodManager f42407g;

    public class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BarrageHorizonalDialog.this.f42403c.setFocusableInTouchMode(true);
            BarrageHorizonalDialog.this.f42403c.requestFocus();
            ((InputMethodManager) BarrageHorizonalDialog.this.f42403c.getContext().getSystemService("input_method")).showSoftInput(BarrageHorizonalDialog.this.f42403c, 1);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            BarrageHorizonalDialog.this.f42407g.showSoftInput(view, 2);
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
            BarrageHorizonalDialog.this.f42404d.setText((20 - editable.length()) + "");
            if (editable.length() > 0) {
                BarrageHorizonalDialog.this.f42405e.setEnabled(true);
                BarrageHorizonalDialog.this.f42405e.setTextColor(BarrageHorizonalDialog.this.f42402b.getResources().getColor(R.color.white));
                BarrageHorizonalDialog.this.f42405e.setBackground(BarrageHorizonalDialog.this.f42402b.getResources().getDrawable(R.drawable.shape_video_barrage_submit_green));
            } else {
                BarrageHorizonalDialog.this.f42405e.setEnabled(false);
                BarrageHorizonalDialog.this.f42405e.setTextColor(BarrageHorizonalDialog.this.f42402b.getResources().getColor(R.color.color_999999));
                BarrageHorizonalDialog.this.f42405e.setBackground(BarrageHorizonalDialog.this.f42402b.getResources().getDrawable(R.drawable.bg_video_comment_edit));
            }
        }
    }

    public interface d {
        void a(String str);
    }

    public void i(d dVar) {
        this.f42406f = dVar;
    }

    public BarrageHorizonalDialog(Context context) {
        super(context, R.style.dialog_center1);
        requestWindowFeature(1);
        this.f42402b = context;
    }

    public final void g(View view) {
        this.f42403c = (EditText) view.findViewById(R.id.et_input);
        this.f42404d = (TextView) view.findViewById(R.id.tv_et_num);
        Button button = (Button) view.findViewById(R.id.bt_submit);
        this.f42405e = button;
        button.setOnClickListener(this);
    }

    public final void h() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(4);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.bt_submit) {
            String strTrim = this.f42403c.getText().toString().trim();
            s.c(this.f42403c);
            d dVar = this.f42406f;
            if (dVar != null) {
                dVar.a(strTrim);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42402b, R.layout.dialog_video_horizonal_barrage, null);
        g(viewGroup);
        setContentView(viewGroup);
        h();
        setOnShowListener(new a());
        this.f42407g = (InputMethodManager) this.f42402b.getSystemService("input_method");
        this.f42403c.setOnTouchListener(new b());
        this.f42403c.addTextChangedListener(new c());
    }
}
