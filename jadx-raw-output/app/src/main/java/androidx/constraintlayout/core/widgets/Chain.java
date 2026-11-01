package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i10) {
        ChainHead[] chainHeadArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i12 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i11 = 0;
        } else {
            int i13 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i11 = 2;
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            ChainHead chainHead = chainHeadArr[i14];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i10, i11, chainHead);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:105:0x0177  */
    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:202:0x034c  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[PHI: r8 r16
  0x0044: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[PHI: r8 r16
  0x0046: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i10, int i11, ChainHead chainHead) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i12;
        int i13;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ?? r10;
        SolverVariable solverVariable4;
        float f10;
        int size;
        ConstraintAnchor constraintAnchor3;
        int i14;
        int i15 = i10;
        ConstraintWidget constraintWidget = chainHead.mFirst;
        ConstraintWidget constraintWidget2 = chainHead.mLast;
        ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f11 = chainHead.mTotalWeight;
        boolean z13 = constraintWidgetContainer.mListDimensionBehaviors[i15] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i15 == 0) {
            int i16 = constraintWidget5.mHorizontalChainStyle;
            z10 = i16 == 0;
            z11 = i16 == 1;
            if (i16 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            int i17 = constraintWidget5.mVerticalChainStyle;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        boolean z14 = z11;
        boolean z15 = false;
        boolean z16 = z10;
        ?? r11 = constraintWidget;
        while (true) {
            obj = null;
            if (z15) {
                break;
            }
            ConstraintAnchor constraintAnchor4 = r11.mListAnchors[i11];
            int i18 = z12 ? 1 : 4;
            int margin = constraintAnchor4.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r11.mListDimensionBehaviors[i15];
            float f12 = f11;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z17 = dimensionBehaviour == dimensionBehaviour2 && r11.mResolvedMatchConstraintDefault[i15] == 0;
            ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
            if (constraintAnchor5 != null && r11 != constraintWidget) {
                margin += constraintAnchor5.getMargin();
            }
            int i19 = margin;
            if (z12 && r11 != constraintWidget && r11 != constraintWidget3) {
                i18 = 8;
            }
            ConstraintAnchor constraintAnchor6 = constraintAnchor4.mTarget;
            if (constraintAnchor6 != null) {
                if (r11 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor4.mSolverVariable, constraintAnchor6.mSolverVariable, i19, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor4.mSolverVariable, constraintAnchor6.mSolverVariable, i19, 8);
                }
                if (z17 && !z12) {
                    i18 = 5;
                }
                linearSystem.addEquality(constraintAnchor4.mSolverVariable, constraintAnchor4.mTarget.mSolverVariable, i19, (r11 == constraintWidget3 && z12 && r11.isInBarrier(i15)) ? 5 : i18);
            } else {
                constraintWidget = constraintWidget;
            }
            if (z13) {
                if (r11.getVisibility() == 8 || r11.mListDimensionBehaviors[i15] != dimensionBehaviour2) {
                    i14 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r11.mListAnchors;
                    i14 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr[i11 + 1].mSolverVariable, constraintAnchorArr[i11].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r11.mListAnchors[i11].mSolverVariable, constraintWidgetContainer.mListAnchors[i11].mSolverVariable, i14, 8);
            }
            ConstraintAnchor constraintAnchor7 = r11.mListAnchors[i11 + 1].mTarget;
            if (constraintAnchor7 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor7.mOwner;
                ConstraintAnchor constraintAnchor8 = constraintWidget6.mListAnchors[i11].mTarget;
                if (constraintAnchor8 != null && constraintAnchor8.mOwner == r11) {
                    obj = constraintWidget6;
                }
            }
            if (obj != null) {
                r11 = obj;
                z15 = z15;
            } else {
                z15 = true;
            }
            constraintWidget5 = constraintWidget5;
            f11 = f12;
            constraintWidget = constraintWidget;
            r11 = r11;
        }
        ConstraintWidget constraintWidget7 = constraintWidget5;
        float f13 = f11;
        ConstraintWidget constraintWidget8 = constraintWidget;
        if (constraintWidget4 != null) {
            int i20 = i11 + 1;
            if (constraintWidget2.mListAnchors[i20].mTarget != null) {
                ConstraintAnchor constraintAnchor9 = constraintWidget4.mListAnchors[i20];
                if ((constraintWidget4.mListDimensionBehaviors[i15] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mResolvedMatchConstraintDefault[i15] == 0) && !z12) {
                    ConstraintAnchor constraintAnchor10 = constraintAnchor9.mTarget;
                    if (constraintAnchor10.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor9.mSolverVariable, constraintAnchor10.mSolverVariable, -constraintAnchor9.getMargin(), 5);
                    } else if (z12) {
                        constraintAnchor3 = constraintAnchor9.mTarget;
                        if (constraintAnchor3.mOwner == constraintWidgetContainer) {
                            linearSystem.addEquality(constraintAnchor9.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor9.getMargin(), 4);
                        }
                    }
                } else if (z12) {
                    constraintAnchor3 = constraintAnchor9.mTarget;
                    if (constraintAnchor3.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor9.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor9.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor9.mSolverVariable, constraintWidget2.mListAnchors[i20].mTarget.mSolverVariable, -constraintAnchor9.getMargin(), 6);
            }
        }
        if (z13) {
            int i21 = i11 + 1;
            SolverVariable solverVariable5 = constraintWidgetContainer.mListAnchors[i21].mSolverVariable;
            ConstraintAnchor constraintAnchor11 = constraintWidget2.mListAnchors[i21];
            linearSystem.addGreaterThan(solverVariable5, constraintAnchor11.mSolverVariable, constraintAnchor11.getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f14 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f13 : chainHead.mWidgetsMatchCount;
            float f15 = 0.0f;
            float f16 = 0.0f;
            ConstraintWidget constraintWidget9 = null;
            int i22 = 0;
            while (i22 < size) {
                ConstraintWidget constraintWidget10 = arrayList.get(i22);
                float f17 = constraintWidget10.mWeight[i15];
                if (f17 < f15) {
                    if (chainHead.mHasComplexMatchWeights) {
                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget10.mListAnchors;
                        linearSystem.addEquality(constraintAnchorArr2[i11 + 1].mSolverVariable, constraintAnchorArr2[i11].mSolverVariable, 0, 4);
                    } else {
                        f17 = 1.0f;
                        f15 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i22++;
                    size = size;
                    arrayList = arrayList;
                    f15 = 0.0f;
                }
                if (f17 == f15) {
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget10.mListAnchors;
                    linearSystem.addEquality(constraintAnchorArr3[i11 + 1].mSolverVariable, constraintAnchorArr3[i11].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (constraintWidget9 != null) {
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget9.mListAnchors;
                        SolverVariable solverVariable6 = constraintAnchorArr4[i11].mSolverVariable;
                        int i23 = i11 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr4[i23].mSolverVariable;
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget10.mListAnchors;
                        SolverVariable solverVariable8 = constraintAnchorArr5[i11].mSolverVariable;
                        SolverVariable solverVariable9 = constraintAnchorArr5[i23].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f16, f14, f17, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    constraintWidget9 = constraintWidget10;
                    f16 = f17;
                }
                i22++;
                size = size;
                arrayList = arrayList;
                f15 = 0.0f;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z12)) {
            ConstraintAnchor constraintAnchor12 = constraintWidget8.mListAnchors[i11];
            int i24 = i11 + 1;
            ConstraintAnchor constraintAnchor13 = constraintWidget2.mListAnchors[i24];
            ConstraintAnchor constraintAnchor14 = constraintAnchor12.mTarget;
            SolverVariable solverVariable10 = constraintAnchor14 != null ? constraintAnchor14.mSolverVariable : null;
            ConstraintAnchor constraintAnchor15 = constraintAnchor13.mTarget;
            SolverVariable solverVariable11 = constraintAnchor15 != null ? constraintAnchor15.mSolverVariable : null;
            ConstraintAnchor constraintAnchor16 = constraintWidget3.mListAnchors[i11];
            if (constraintWidget4 != null) {
                constraintAnchor13 = constraintWidget4.mListAnchors[i24];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                if (i15 == 0) {
                    f10 = constraintWidget7.mHorizontalBiasPercent;
                } else {
                    f10 = constraintWidget7.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor16.mSolverVariable, solverVariable10, constraintAnchor16.getMargin(), f10, solverVariable11, constraintAnchor13.mSolverVariable, constraintAnchor13.getMargin(), 7);
            }
        } else if (!z16 || constraintWidget3 == null) {
            int i25 = 8;
            if (z14 && constraintWidget3 != null) {
                int i26 = chainHead.mWidgetsMatchCount;
                boolean z18 = i26 > 0 && chainHead.mWidgetsCount == i26;
                ConstraintWidget constraintWidget11 = constraintWidget3;
                ConstraintWidget constraintWidget12 = constraintWidget11;
                while (constraintWidget12 != null) {
                    ConstraintWidget constraintWidget13 = constraintWidget12.mNextChainWidget[i15];
                    while (constraintWidget13 != null && constraintWidget13.getVisibility() == i25) {
                        constraintWidget13 = constraintWidget13.mNextChainWidget[i15];
                    }
                    if (constraintWidget12 == constraintWidget3 || constraintWidget12 == constraintWidget4 || constraintWidget13 == null) {
                        constraintWidget11 = constraintWidget11;
                        i13 = i25;
                    } else {
                        ConstraintWidget constraintWidget14 = constraintWidget13 == constraintWidget4 ? null : constraintWidget13;
                        ConstraintAnchor constraintAnchor17 = constraintWidget12.mListAnchors[i11];
                        SolverVariable solverVariable12 = constraintAnchor17.mSolverVariable;
                        ConstraintAnchor constraintAnchor18 = constraintAnchor17.mTarget;
                        if (constraintAnchor18 != null) {
                            SolverVariable solverVariable13 = constraintAnchor18.mSolverVariable;
                        }
                        int i27 = i11 + 1;
                        SolverVariable solverVariable14 = constraintWidget11.mListAnchors[i27].mSolverVariable;
                        int margin2 = constraintAnchor17.getMargin();
                        int margin3 = constraintWidget12.mListAnchors[i27].getMargin();
                        if (constraintWidget14 != null) {
                            constraintAnchor = constraintWidget14.mListAnchors[i11];
                            SolverVariable solverVariable15 = constraintAnchor.mSolverVariable;
                            ConstraintAnchor constraintAnchor19 = constraintAnchor.mTarget;
                            solverVariable2 = constraintAnchor19 != null ? constraintAnchor19.mSolverVariable : null;
                            solverVariable = solverVariable15;
                        } else {
                            constraintAnchor = constraintWidget4.mListAnchors[i11];
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            solverVariable2 = constraintWidget12.mListAnchors[i27].mSolverVariable;
                        }
                        if (constraintAnchor != null) {
                            margin3 += constraintAnchor.getMargin();
                        }
                        int i28 = margin3;
                        int margin4 = constraintWidget11.mListAnchors[i27].getMargin() + margin2;
                        int i29 = z18 ? 8 : 4;
                        if (solverVariable12 == null || solverVariable14 == null || solverVariable == null || solverVariable2 == null) {
                            i13 = 8;
                        } else {
                            i13 = 8;
                            linearSystem.addCentering(solverVariable12, solverVariable14, margin4, 0.5f, solverVariable, solverVariable2, i28, i29);
                        }
                        constraintWidget13 = constraintWidget14;
                    }
                    constraintWidget11 = constraintWidget12.getVisibility() != i13 ? constraintWidget12 : constraintWidget11;
                    constraintWidget12 = constraintWidget13;
                    i25 = i13;
                    i15 = i10;
                }
                ConstraintAnchor constraintAnchor20 = constraintWidget3.mListAnchors[i11];
                ConstraintAnchor constraintAnchor21 = constraintWidget8.mListAnchors[i11].mTarget;
                int i30 = i11 + 1;
                ConstraintAnchor constraintAnchor22 = constraintWidget4.mListAnchors[i30];
                ConstraintAnchor constraintAnchor23 = constraintWidget2.mListAnchors[i30].mTarget;
                if (constraintAnchor21 == null) {
                    i12 = 5;
                } else if (constraintWidget3 != constraintWidget4) {
                    i12 = 5;
                    linearSystem.addEquality(constraintAnchor20.mSolverVariable, constraintAnchor21.mSolverVariable, constraintAnchor20.getMargin(), 5);
                } else {
                    i12 = 5;
                    if (constraintAnchor23 != null) {
                        linearSystem.addCentering(constraintAnchor20.mSolverVariable, constraintAnchor21.mSolverVariable, constraintAnchor20.getMargin(), 0.5f, constraintAnchor22.mSolverVariable, constraintAnchor23.mSolverVariable, constraintAnchor22.getMargin(), 5);
                    }
                }
                if (constraintAnchor23 != null && constraintWidget3 != constraintWidget4) {
                    linearSystem.addEquality(constraintAnchor22.mSolverVariable, constraintAnchor23.mSolverVariable, -constraintAnchor22.getMargin(), i12);
                }
            }
        } else {
            int i31 = chainHead.mWidgetsMatchCount;
            boolean z19 = i31 > 0 && chainHead.mWidgetsCount == i31;
            ConstraintWidget constraintWidget15 = constraintWidget3;
            ConstraintWidget constraintWidget16 = constraintWidget15;
            while (constraintWidget16 != null) {
                ConstraintWidget constraintWidget17 = constraintWidget16.mNextChainWidget[i15];
                while (constraintWidget17 != null && constraintWidget17.getVisibility() == 8) {
                    constraintWidget17 = constraintWidget17.mNextChainWidget[i15];
                }
                if (constraintWidget17 != null || constraintWidget16 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor24 = constraintWidget16.mListAnchors[i11];
                    SolverVariable solverVariable16 = constraintAnchor24.mSolverVariable;
                    ConstraintAnchor constraintAnchor25 = constraintAnchor24.mTarget;
                    SolverVariable solverVariable17 = constraintAnchor25 != null ? constraintAnchor25.mSolverVariable : null;
                    if (constraintWidget15 != constraintWidget16) {
                        solverVariable17 = constraintWidget15.mListAnchors[i11 + 1].mSolverVariable;
                    } else if (constraintWidget16 == constraintWidget3) {
                        ConstraintAnchor constraintAnchor26 = constraintWidget8.mListAnchors[i11].mTarget;
                        solverVariable17 = constraintAnchor26 != null ? constraintAnchor26.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor24.getMargin();
                    int i32 = i11 + 1;
                    int margin6 = constraintWidget16.mListAnchors[i32].getMargin();
                    if (constraintWidget17 != null) {
                        constraintAnchor2 = constraintWidget17.mListAnchors[i11];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget2.mListAnchors[i32].mTarget;
                        if (constraintAnchor2 != null) {
                            solverVariable3 = constraintAnchor2.mSolverVariable;
                        } else {
                            solverVariable3 = null;
                        }
                        SolverVariable solverVariable18 = constraintWidget16.mListAnchors[i32].mSolverVariable;
                        if (constraintAnchor2 != null) {
                            margin6 += constraintAnchor2.getMargin();
                        }
                        int margin7 = margin5 + constraintWidget15.mListAnchors[i32].getMargin();
                        if (solverVariable16 == null && solverVariable17 != null && solverVariable3 != null && solverVariable18 != null) {
                            if (constraintWidget16 == constraintWidget3) {
                                margin7 = constraintWidget3.mListAnchors[i11].getMargin();
                            }
                            constraintWidget17 = constraintWidget17;
                            linearSystem.addCentering(solverVariable16, solverVariable17, margin7, 0.5f, solverVariable3, solverVariable18, constraintWidget16 == constraintWidget4 ? constraintWidget4.mListAnchors[i32].getMargin() : margin6, z19 ? 8 : 5);
                        }
                        if (constraintWidget16.getVisibility() != 8) {
                            constraintWidget16 = constraintWidget15;
                        }
                        constraintWidget15 = constraintWidget16;
                        constraintWidget16 = constraintWidget17;
                    }
                    SolverVariable solverVariable19 = constraintWidget16.mListAnchors[i32].mSolverVariable;
                    if (constraintAnchor2 != null) {
                        margin6 += constraintAnchor2.getMargin();
                    }
                    int margin8 = margin5 + constraintWidget15.mListAnchors[i32].getMargin();
                    if (solverVariable16 == null) {
                    }
                }
                if (constraintWidget16.getVisibility() != 8) {
                    constraintWidget16 = constraintWidget15;
                }
                constraintWidget15 = constraintWidget16;
                constraintWidget16 = constraintWidget17;
            }
        }
        if ((!z16 && !z14) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
            return;
        }
        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget3.mListAnchors;
        ConstraintAnchor constraintAnchor27 = constraintAnchorArr6[i11];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        int i33 = i11 + 1;
        ConstraintAnchor constraintAnchor28 = constraintWidget4.mListAnchors[i33];
        ConstraintAnchor constraintAnchor29 = constraintAnchor27.mTarget;
        SolverVariable solverVariable20 = constraintAnchor29 != null ? constraintAnchor29.mSolverVariable : null;
        ConstraintAnchor constraintAnchor30 = constraintAnchor28.mTarget;
        if (constraintAnchor30 != null) {
            solverVariable4 = constraintAnchor30.mSolverVariable;
        } else {
            r10 = 0;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor31 = constraintWidget2.mListAnchors[i33].mTarget;
            if (constraintAnchor31 != null) {
                r10 = solverVariable4;
                obj = constraintAnchor31.mSolverVariable;
            }
            r10 = solverVariable4;
            r10 = obj;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor28 = constraintAnchorArr6[i33];
        }
        if (solverVariable20 == null || r10 == 0) {
            return;
        }
        linearSystem.addCentering(constraintAnchor27.mSolverVariable, solverVariable20, constraintAnchor27.getMargin(), 0.5f, r10, constraintAnchor28.mSolverVariable, constraintWidget4.mListAnchors[i33].getMargin(), 5);
    }
}
