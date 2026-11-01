package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q1 f8584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f8585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f8586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f8587d;

    public void a(q1 q1Var, com.applovin.impl.sdk.k kVar) {
        this.f8584a = q1Var;
        this.f8585b = kVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f8584a.d() + " - " + this.f8584a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        e8.a(findViewById(android.R.id.content), this.f8585b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f8587d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.uc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9699b.a(view);
            }
        });
    }

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.f8585b.y().a(this.f8584a));
        String strB = this.f8585b.y().b(this.f8584a);
        if (strB != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f8586c = textView;
        textView.setText(v2Var.toString());
        this.f8586c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f8585b.y().a(this.f8584a, (Context) this, true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share == menuItem.getItemId()) {
            this.f8585b.y().a(this.f8584a, (Context) this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private boolean a() {
        return (this.f8584a == null || this.f8585b == null) ? false : true;
    }
}
