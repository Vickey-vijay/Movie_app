package androidx.navigation.ui;

import androidx.navigation.NavController;
import ck.p;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.Metadata;

/* JADX INFO: compiled from: BottomNavigationView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/google/android/material/navigation/NavigationBarView;", "Landroidx/navigation/NavController;", "navController", "Lmj/r;", "setupWithNavController", "navigation-ui_release"}, k = 2, mv = {1, 6, 0})
public final class BottomNavigationViewKt {
    public static final void setupWithNavController(NavigationBarView navigationBarView, NavController navController) {
        p.j(navigationBarView, "<this>");
        p.j(navController, "navController");
        NavigationUI.setupWithNavController(navigationBarView, navController);
    }
}
