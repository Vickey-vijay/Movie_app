package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameMetricsReport.java */
/* JADX INFO: loaded from: classes.dex */
public class f {
    /* JADX WARN: Code duplicated, block: B:316:0x086e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab A[Catch: Exception -> 0x0868, TryCatch #1 {Exception -> 0x0868, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:27:0x0079, B:30:0x0082, B:32:0x0088, B:35:0x0093, B:37:0x0099, B:51:0x00cf, B:53:0x00d5, B:55:0x00da, B:58:0x00f9, B:60:0x00ff, B:72:0x013f, B:73:0x0143, B:75:0x0149, B:78:0x0152, B:80:0x0199, B:82:0x01fa, B:84:0x0204, B:86:0x0217, B:87:0x0220, B:89:0x0233, B:91:0x0242, B:92:0x024f, B:95:0x025b, B:98:0x0286, B:100:0x028c, B:102:0x0292, B:103:0x02b0, B:104:0x02bb, B:106:0x02c5, B:108:0x02cb, B:111:0x02fb, B:113:0x0303, B:115:0x0309, B:116:0x0327, B:117:0x0332, B:119:0x033a, B:121:0x0340, B:122:0x035e, B:123:0x0369, B:125:0x0371, B:127:0x0377, B:128:0x0395, B:129:0x03a0, B:132:0x03b5, B:134:0x03bf, B:135:0x03c5, B:136:0x03ca, B:138:0x03d0, B:140:0x03de, B:143:0x03ef, B:145:0x03f5, B:152:0x043d, B:154:0x0447, B:157:0x0453, B:159:0x0459, B:160:0x0472, B:161:0x0476, B:163:0x047c, B:164:0x0495, B:165:0x0498, B:167:0x04a2, B:169:0x04b2, B:172:0x04dd, B:175:0x04e6, B:177:0x04ec, B:183:0x052b, B:187:0x0537, B:189:0x054e, B:191:0x0573, B:193:0x057b, B:195:0x05a0, B:197:0x05a4, B:199:0x05b4, B:200:0x05ba, B:202:0x05c4, B:203:0x05ce, B:205:0x05d4, B:206:0x05e1, B:208:0x0602, B:210:0x0609, B:211:0x0617, B:213:0x0621, B:214:0x062a, B:216:0x0632, B:218:0x0639, B:219:0x0647, B:221:0x0651, B:222:0x065a, B:223:0x0667, B:225:0x066f, B:229:0x0682, B:232:0x0691, B:234:0x06b8, B:236:0x06be, B:238:0x06c3, B:237:0x06c1, B:239:0x06ca, B:241:0x06d2, B:243:0x06d8, B:245:0x06dd, B:244:0x06db, B:246:0x06e4, B:249:0x06ee, B:251:0x06f6, B:252:0x06fe, B:254:0x070e, B:256:0x0714, B:258:0x0719, B:260:0x0729, B:262:0x072f, B:264:0x0734, B:268:0x0746, B:272:0x0767, B:274:0x0770, B:277:0x0791, B:279:0x079d, B:285:0x07ab, B:287:0x07b7, B:289:0x07c1, B:295:0x07d9, B:297:0x07ec, B:299:0x07f2, B:301:0x07f7, B:300:0x07f5, B:296:0x07e3, B:290:0x07ca, B:292:0x07d0, B:311:0x0832, B:302:0x07ff, B:304:0x080d, B:306:0x0820, B:308:0x0826, B:310:0x082b, B:309:0x0829, B:305:0x0817, B:275:0x077c, B:271:0x0763, B:263:0x0732, B:257:0x0717, B:194:0x0599, B:190:0x056c, B:178:0x0505, B:179:0x0509, B:181:0x050f, B:182:0x0528, B:170:0x04d2, B:146:0x0410, B:147:0x0416, B:149:0x041e, B:150:0x0437, B:109:0x02eb, B:96:0x0279, B:88:0x022a, B:81:0x01da, B:68:0x0135, B:70:0x0139, B:33:0x008d, B:39:0x009f, B:42:0x00ab, B:44:0x00b3, B:45:0x00bb, B:47:0x00c1, B:50:0x00cc, B:48:0x00c6, B:20:0x0059, B:11:0x0041, B:13:0x0047, B:62:0x010f, B:64:0x012e), top: B:321:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[Catch: Exception -> 0x0868, TryCatch #1 {Exception -> 0x0868, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:27:0x0079, B:30:0x0082, B:32:0x0088, B:35:0x0093, B:37:0x0099, B:51:0x00cf, B:53:0x00d5, B:55:0x00da, B:58:0x00f9, B:60:0x00ff, B:72:0x013f, B:73:0x0143, B:75:0x0149, B:78:0x0152, B:80:0x0199, B:82:0x01fa, B:84:0x0204, B:86:0x0217, B:87:0x0220, B:89:0x0233, B:91:0x0242, B:92:0x024f, B:95:0x025b, B:98:0x0286, B:100:0x028c, B:102:0x0292, B:103:0x02b0, B:104:0x02bb, B:106:0x02c5, B:108:0x02cb, B:111:0x02fb, B:113:0x0303, B:115:0x0309, B:116:0x0327, B:117:0x0332, B:119:0x033a, B:121:0x0340, B:122:0x035e, B:123:0x0369, B:125:0x0371, B:127:0x0377, B:128:0x0395, B:129:0x03a0, B:132:0x03b5, B:134:0x03bf, B:135:0x03c5, B:136:0x03ca, B:138:0x03d0, B:140:0x03de, B:143:0x03ef, B:145:0x03f5, B:152:0x043d, B:154:0x0447, B:157:0x0453, B:159:0x0459, B:160:0x0472, B:161:0x0476, B:163:0x047c, B:164:0x0495, B:165:0x0498, B:167:0x04a2, B:169:0x04b2, B:172:0x04dd, B:175:0x04e6, B:177:0x04ec, B:183:0x052b, B:187:0x0537, B:189:0x054e, B:191:0x0573, B:193:0x057b, B:195:0x05a0, B:197:0x05a4, B:199:0x05b4, B:200:0x05ba, B:202:0x05c4, B:203:0x05ce, B:205:0x05d4, B:206:0x05e1, B:208:0x0602, B:210:0x0609, B:211:0x0617, B:213:0x0621, B:214:0x062a, B:216:0x0632, B:218:0x0639, B:219:0x0647, B:221:0x0651, B:222:0x065a, B:223:0x0667, B:225:0x066f, B:229:0x0682, B:232:0x0691, B:234:0x06b8, B:236:0x06be, B:238:0x06c3, B:237:0x06c1, B:239:0x06ca, B:241:0x06d2, B:243:0x06d8, B:245:0x06dd, B:244:0x06db, B:246:0x06e4, B:249:0x06ee, B:251:0x06f6, B:252:0x06fe, B:254:0x070e, B:256:0x0714, B:258:0x0719, B:260:0x0729, B:262:0x072f, B:264:0x0734, B:268:0x0746, B:272:0x0767, B:274:0x0770, B:277:0x0791, B:279:0x079d, B:285:0x07ab, B:287:0x07b7, B:289:0x07c1, B:295:0x07d9, B:297:0x07ec, B:299:0x07f2, B:301:0x07f7, B:300:0x07f5, B:296:0x07e3, B:290:0x07ca, B:292:0x07d0, B:311:0x0832, B:302:0x07ff, B:304:0x080d, B:306:0x0820, B:308:0x0826, B:310:0x082b, B:309:0x0829, B:305:0x0817, B:275:0x077c, B:271:0x0763, B:263:0x0732, B:257:0x0717, B:194:0x0599, B:190:0x056c, B:178:0x0505, B:179:0x0509, B:181:0x050f, B:182:0x0528, B:170:0x04d2, B:146:0x0410, B:147:0x0416, B:149:0x041e, B:150:0x0437, B:109:0x02eb, B:96:0x0279, B:88:0x022a, B:81:0x01da, B:68:0x0135, B:70:0x0139, B:33:0x008d, B:39:0x009f, B:42:0x00ab, B:44:0x00b3, B:45:0x00bb, B:47:0x00c1, B:50:0x00cc, B:48:0x00c6, B:20:0x0059, B:11:0x0041, B:13:0x0047, B:62:0x010f, B:64:0x012e), top: B:321:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb A[Catch: Exception -> 0x0868, TryCatch #1 {Exception -> 0x0868, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:27:0x0079, B:30:0x0082, B:32:0x0088, B:35:0x0093, B:37:0x0099, B:51:0x00cf, B:53:0x00d5, B:55:0x00da, B:58:0x00f9, B:60:0x00ff, B:72:0x013f, B:73:0x0143, B:75:0x0149, B:78:0x0152, B:80:0x0199, B:82:0x01fa, B:84:0x0204, B:86:0x0217, B:87:0x0220, B:89:0x0233, B:91:0x0242, B:92:0x024f, B:95:0x025b, B:98:0x0286, B:100:0x028c, B:102:0x0292, B:103:0x02b0, B:104:0x02bb, B:106:0x02c5, B:108:0x02cb, B:111:0x02fb, B:113:0x0303, B:115:0x0309, B:116:0x0327, B:117:0x0332, B:119:0x033a, B:121:0x0340, B:122:0x035e, B:123:0x0369, B:125:0x0371, B:127:0x0377, B:128:0x0395, B:129:0x03a0, B:132:0x03b5, B:134:0x03bf, B:135:0x03c5, B:136:0x03ca, B:138:0x03d0, B:140:0x03de, B:143:0x03ef, B:145:0x03f5, B:152:0x043d, B:154:0x0447, B:157:0x0453, B:159:0x0459, B:160:0x0472, B:161:0x0476, B:163:0x047c, B:164:0x0495, B:165:0x0498, B:167:0x04a2, B:169:0x04b2, B:172:0x04dd, B:175:0x04e6, B:177:0x04ec, B:183:0x052b, B:187:0x0537, B:189:0x054e, B:191:0x0573, B:193:0x057b, B:195:0x05a0, B:197:0x05a4, B:199:0x05b4, B:200:0x05ba, B:202:0x05c4, B:203:0x05ce, B:205:0x05d4, B:206:0x05e1, B:208:0x0602, B:210:0x0609, B:211:0x0617, B:213:0x0621, B:214:0x062a, B:216:0x0632, B:218:0x0639, B:219:0x0647, B:221:0x0651, B:222:0x065a, B:223:0x0667, B:225:0x066f, B:229:0x0682, B:232:0x0691, B:234:0x06b8, B:236:0x06be, B:238:0x06c3, B:237:0x06c1, B:239:0x06ca, B:241:0x06d2, B:243:0x06d8, B:245:0x06dd, B:244:0x06db, B:246:0x06e4, B:249:0x06ee, B:251:0x06f6, B:252:0x06fe, B:254:0x070e, B:256:0x0714, B:258:0x0719, B:260:0x0729, B:262:0x072f, B:264:0x0734, B:268:0x0746, B:272:0x0767, B:274:0x0770, B:277:0x0791, B:279:0x079d, B:285:0x07ab, B:287:0x07b7, B:289:0x07c1, B:295:0x07d9, B:297:0x07ec, B:299:0x07f2, B:301:0x07f7, B:300:0x07f5, B:296:0x07e3, B:290:0x07ca, B:292:0x07d0, B:311:0x0832, B:302:0x07ff, B:304:0x080d, B:306:0x0820, B:308:0x0826, B:310:0x082b, B:309:0x0829, B:305:0x0817, B:275:0x077c, B:271:0x0763, B:263:0x0732, B:257:0x0717, B:194:0x0599, B:190:0x056c, B:178:0x0505, B:179:0x0509, B:181:0x050f, B:182:0x0528, B:170:0x04d2, B:146:0x0410, B:147:0x0416, B:149:0x041e, B:150:0x0437, B:109:0x02eb, B:96:0x0279, B:88:0x022a, B:81:0x01da, B:68:0x0135, B:70:0x0139, B:33:0x008d, B:39:0x009f, B:42:0x00ab, B:44:0x00b3, B:45:0x00bb, B:47:0x00c1, B:50:0x00cc, B:48:0x00c6, B:20:0x0059, B:11:0x0041, B:13:0x0047, B:62:0x010f, B:64:0x012e), top: B:321:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[Catch: Exception -> 0x0868, TryCatch #1 {Exception -> 0x0868, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:27:0x0079, B:30:0x0082, B:32:0x0088, B:35:0x0093, B:37:0x0099, B:51:0x00cf, B:53:0x00d5, B:55:0x00da, B:58:0x00f9, B:60:0x00ff, B:72:0x013f, B:73:0x0143, B:75:0x0149, B:78:0x0152, B:80:0x0199, B:82:0x01fa, B:84:0x0204, B:86:0x0217, B:87:0x0220, B:89:0x0233, B:91:0x0242, B:92:0x024f, B:95:0x025b, B:98:0x0286, B:100:0x028c, B:102:0x0292, B:103:0x02b0, B:104:0x02bb, B:106:0x02c5, B:108:0x02cb, B:111:0x02fb, B:113:0x0303, B:115:0x0309, B:116:0x0327, B:117:0x0332, B:119:0x033a, B:121:0x0340, B:122:0x035e, B:123:0x0369, B:125:0x0371, B:127:0x0377, B:128:0x0395, B:129:0x03a0, B:132:0x03b5, B:134:0x03bf, B:135:0x03c5, B:136:0x03ca, B:138:0x03d0, B:140:0x03de, B:143:0x03ef, B:145:0x03f5, B:152:0x043d, B:154:0x0447, B:157:0x0453, B:159:0x0459, B:160:0x0472, B:161:0x0476, B:163:0x047c, B:164:0x0495, B:165:0x0498, B:167:0x04a2, B:169:0x04b2, B:172:0x04dd, B:175:0x04e6, B:177:0x04ec, B:183:0x052b, B:187:0x0537, B:189:0x054e, B:191:0x0573, B:193:0x057b, B:195:0x05a0, B:197:0x05a4, B:199:0x05b4, B:200:0x05ba, B:202:0x05c4, B:203:0x05ce, B:205:0x05d4, B:206:0x05e1, B:208:0x0602, B:210:0x0609, B:211:0x0617, B:213:0x0621, B:214:0x062a, B:216:0x0632, B:218:0x0639, B:219:0x0647, B:221:0x0651, B:222:0x065a, B:223:0x0667, B:225:0x066f, B:229:0x0682, B:232:0x0691, B:234:0x06b8, B:236:0x06be, B:238:0x06c3, B:237:0x06c1, B:239:0x06ca, B:241:0x06d2, B:243:0x06d8, B:245:0x06dd, B:244:0x06db, B:246:0x06e4, B:249:0x06ee, B:251:0x06f6, B:252:0x06fe, B:254:0x070e, B:256:0x0714, B:258:0x0719, B:260:0x0729, B:262:0x072f, B:264:0x0734, B:268:0x0746, B:272:0x0767, B:274:0x0770, B:277:0x0791, B:279:0x079d, B:285:0x07ab, B:287:0x07b7, B:289:0x07c1, B:295:0x07d9, B:297:0x07ec, B:299:0x07f2, B:301:0x07f7, B:300:0x07f5, B:296:0x07e3, B:290:0x07ca, B:292:0x07d0, B:311:0x0832, B:302:0x07ff, B:304:0x080d, B:306:0x0820, B:308:0x0826, B:310:0x082b, B:309:0x0829, B:305:0x0817, B:275:0x077c, B:271:0x0763, B:263:0x0732, B:257:0x0717, B:194:0x0599, B:190:0x056c, B:178:0x0505, B:179:0x0509, B:181:0x050f, B:182:0x0528, B:170:0x04d2, B:146:0x0410, B:147:0x0416, B:149:0x041e, B:150:0x0437, B:109:0x02eb, B:96:0x0279, B:88:0x022a, B:81:0x01da, B:68:0x0135, B:70:0x0139, B:33:0x008d, B:39:0x009f, B:42:0x00ab, B:44:0x00b3, B:45:0x00bb, B:47:0x00c1, B:50:0x00cc, B:48:0x00c6, B:20:0x0059, B:11:0x0041, B:13:0x0047, B:62:0x010f, B:64:0x012e), top: B:321:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[Catch: Exception -> 0x0868, TryCatch #1 {Exception -> 0x0868, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:27:0x0079, B:30:0x0082, B:32:0x0088, B:35:0x0093, B:37:0x0099, B:51:0x00cf, B:53:0x00d5, B:55:0x00da, B:58:0x00f9, B:60:0x00ff, B:72:0x013f, B:73:0x0143, B:75:0x0149, B:78:0x0152, B:80:0x0199, B:82:0x01fa, B:84:0x0204, B:86:0x0217, B:87:0x0220, B:89:0x0233, B:91:0x0242, B:92:0x024f, B:95:0x025b, B:98:0x0286, B:100:0x028c, B:102:0x0292, B:103:0x02b0, B:104:0x02bb, B:106:0x02c5, B:108:0x02cb, B:111:0x02fb, B:113:0x0303, B:115:0x0309, B:116:0x0327, B:117:0x0332, B:119:0x033a, B:121:0x0340, B:122:0x035e, B:123:0x0369, B:125:0x0371, B:127:0x0377, B:128:0x0395, B:129:0x03a0, B:132:0x03b5, B:134:0x03bf, B:135:0x03c5, B:136:0x03ca, B:138:0x03d0, B:140:0x03de, B:143:0x03ef, B:145:0x03f5, B:152:0x043d, B:154:0x0447, B:157:0x0453, B:159:0x0459, B:160:0x0472, B:161:0x0476, B:163:0x047c, B:164:0x0495, B:165:0x0498, B:167:0x04a2, B:169:0x04b2, B:172:0x04dd, B:175:0x04e6, B:177:0x04ec, B:183:0x052b, B:187:0x0537, B:189:0x054e, B:191:0x0573, B:193:0x057b, B:195:0x05a0, B:197:0x05a4, B:199:0x05b4, B:200:0x05ba, B:202:0x05c4, B:203:0x05ce, B:205:0x05d4, B:206:0x05e1, B:208:0x0602, B:210:0x0609, B:211:0x0617, B:213:0x0621, B:214:0x062a, B:216:0x0632, B:218:0x0639, B:219:0x0647, B:221:0x0651, B:222:0x065a, B:223:0x0667, B:225:0x066f, B:229:0x0682, B:232:0x0691, B:234:0x06b8, B:236:0x06be, B:238:0x06c3, B:237:0x06c1, B:239:0x06ca, B:241:0x06d2, B:243:0x06d8, B:245:0x06dd, B:244:0x06db, B:246:0x06e4, B:249:0x06ee, B:251:0x06f6, B:252:0x06fe, B:254:0x070e, B:256:0x0714, B:258:0x0719, B:260:0x0729, B:262:0x072f, B:264:0x0734, B:268:0x0746, B:272:0x0767, B:274:0x0770, B:277:0x0791, B:279:0x079d, B:285:0x07ab, B:287:0x07b7, B:289:0x07c1, B:295:0x07d9, B:297:0x07ec, B:299:0x07f2, B:301:0x07f7, B:300:0x07f5, B:296:0x07e3, B:290:0x07ca, B:292:0x07d0, B:311:0x0832, B:302:0x07ff, B:304:0x080d, B:306:0x0820, B:308:0x0826, B:310:0x082b, B:309:0x0829, B:305:0x0817, B:275:0x077c, B:271:0x0763, B:263:0x0732, B:257:0x0717, B:194:0x0599, B:190:0x056c, B:178:0x0505, B:179:0x0509, B:181:0x050f, B:182:0x0528, B:170:0x04d2, B:146:0x0410, B:147:0x0416, B:149:0x041e, B:150:0x0437, B:109:0x02eb, B:96:0x0279, B:88:0x022a, B:81:0x01da, B:68:0x0135, B:70:0x0139, B:33:0x008d, B:39:0x009f, B:42:0x00ab, B:44:0x00b3, B:45:0x00bb, B:47:0x00c1, B:50:0x00cc, B:48:0x00c6, B:20:0x0059, B:11:0x0041, B:13:0x0047, B:62:0x010f, B:64:0x012e), top: B:321:0x001d, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: Exception -> 0x0868, TryCatch #1 {Exception -> 0x0868, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:27:0x0079, B:30:0x0082, B:32:0x0088, B:35:0x0093, B:37:0x0099, B:51:0x00cf, B:53:0x00d5, B:55:0x00da, B:58:0x00f9, B:60:0x00ff, B:72:0x013f, B:73:0x0143, B:75:0x0149, B:78:0x0152, B:80:0x0199, B:82:0x01fa, B:84:0x0204, B:86:0x0217, B:87:0x0220, B:89:0x0233, B:91:0x0242, B:92:0x024f, B:95:0x025b, B:98:0x0286, B:100:0x028c, B:102:0x0292, B:103:0x02b0, B:104:0x02bb, B:106:0x02c5, B:108:0x02cb, B:111:0x02fb, B:113:0x0303, B:115:0x0309, B:116:0x0327, B:117:0x0332, B:119:0x033a, B:121:0x0340, B:122:0x035e, B:123:0x0369, B:125:0x0371, B:127:0x0377, B:128:0x0395, B:129:0x03a0, B:132:0x03b5, B:134:0x03bf, B:135:0x03c5, B:136:0x03ca, B:138:0x03d0, B:140:0x03de, B:143:0x03ef, B:145:0x03f5, B:152:0x043d, B:154:0x0447, B:157:0x0453, B:159:0x0459, B:160:0x0472, B:161:0x0476, B:163:0x047c, B:164:0x0495, B:165:0x0498, B:167:0x04a2, B:169:0x04b2, B:172:0x04dd, B:175:0x04e6, B:177:0x04ec, B:183:0x052b, B:187:0x0537, B:189:0x054e, B:191:0x0573, B:193:0x057b, B:195:0x05a0, B:197:0x05a4, B:199:0x05b4, B:200:0x05ba, B:202:0x05c4, B:203:0x05ce, B:205:0x05d4, B:206:0x05e1, B:208:0x0602, B:210:0x0609, B:211:0x0617, B:213:0x0621, B:214:0x062a, B:216:0x0632, B:218:0x0639, B:219:0x0647, B:221:0x0651, B:222:0x065a, B:223:0x0667, B:225:0x066f, B:229:0x0682, B:232:0x0691, B:234:0x06b8, B:236:0x06be, B:238:0x06c3, B:237:0x06c1, B:239:0x06ca, B:241:0x06d2, B:243:0x06d8, B:245:0x06dd, B:244:0x06db, B:246:0x06e4, B:249:0x06ee, B:251:0x06f6, B:252:0x06fe, B:254:0x070e, B:256:0x0714, B:258:0x0719, B:260:0x0729, B:262:0x072f, B:264:0x0734, B:268:0x0746, B:272:0x0767, B:274:0x0770, B:277:0x0791, B:279:0x079d, B:285:0x07ab, B:287:0x07b7, B:289:0x07c1, B:295:0x07d9, B:297:0x07ec, B:299:0x07f2, B:301:0x07f7, B:300:0x07f5, B:296:0x07e3, B:290:0x07ca, B:292:0x07d0, B:311:0x0832, B:302:0x07ff, B:304:0x080d, B:306:0x0820, B:308:0x0826, B:310:0x082b, B:309:0x0829, B:305:0x0817, B:275:0x077c, B:271:0x0763, B:263:0x0732, B:257:0x0717, B:194:0x0599, B:190:0x056c, B:178:0x0505, B:179:0x0509, B:181:0x050f, B:182:0x0528, B:170:0x04d2, B:146:0x0410, B:147:0x0416, B:149:0x041e, B:150:0x0437, B:109:0x02eb, B:96:0x0279, B:88:0x022a, B:81:0x01da, B:68:0x0135, B:70:0x0139, B:33:0x008d, B:39:0x009f, B:42:0x00ab, B:44:0x00b3, B:45:0x00bb, B:47:0x00c1, B:50:0x00cc, B:48:0x00c6, B:20:0x0059, B:11:0x0041, B:13:0x0047, B:62:0x010f, B:64:0x012e), top: B:321:0x001d, inners: #0, #3 }] */
    private Map<String, String> c(String str, c cVar) {
        Exception exc;
        boolean z10;
        String str2;
        boolean z11;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean zContains;
        List<CampaignEx> listM;
        String str7 = "cid";
        String str8 = "dspid";
        String str9 = CampaignEx.JSON_KEY_EC_TEMP_ID;
        e eVar = new e();
        try {
            if (Arrays.asList(b.f35149g).contains(str)) {
                return eVar.a();
            }
            if (cVar == null) {
                eVar.a("metrics_data_reason", "metrics 上报时意外为空");
                return eVar.a();
            }
            List arrayList = new ArrayList();
            try {
                z10 = cVar.n() != null && cVar.n().getAdType() == 295;
            } catch (Throwable th2) {
                q0.b("SameMetricsReport", th2.getMessage());
            }
            if (!z10) {
                try {
                    if (Arrays.asList(b.f35148f).contains(str)) {
                        if ("m_download_start".equals(str) || "m_download_end".equals(str)) {
                            arrayList = a(cVar, str);
                        } else {
                            List<CampaignEx> listO = cVar.o() != null ? cVar.o() : cVar.m();
                            if (listO != null && listO.size() > 0) {
                                arrayList.addAll(listO);
                            }
                        }
                    } else if (cVar.n() != null) {
                        arrayList.add(cVar.n());
                    } else {
                        if (cVar.o() != null) {
                            listM = cVar.o();
                        } else {
                            listM = cVar.m();
                        }
                        if (listM != null) {
                            arrayList.addAll(listM);
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    if (MBridgeConstans.DEBUG) {
                        exc.printStackTrace();
                    }
                }
            } else if (cVar.n() != null) {
                arrayList.add(cVar.n());
            } else {
                if (cVar.o() != null) {
                    listM = cVar.o();
                } else {
                    listM = cVar.m();
                }
                if (listM != null) {
                    arrayList.addAll(listM);
                }
            }
            if (arrayList.isEmpty()) {
                return eVar.a();
            }
            Map<String, Map<String, String>> mapW = cVar.w();
            String str10 = cVar.t() + str;
            Object obj = "1";
            if (!mapW.containsKey(str10) || mapW.get(str10) == null) {
                str2 = "rid_n";
            } else {
                str2 = "rid_n";
                if (mapW.get(str10).containsKey("126_exclude")) {
                    try {
                        String str11 = mapW.get(str10).get("126_exclude");
                        mapW.get(str10).remove("126_exclude");
                        if ("1".equals(str11)) {
                            return eVar.a();
                        }
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx != null) {
                    eVar.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                    eVar.a("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                    eVar.a("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                    ArrayList<Integer> rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule != null) {
                        z11 = false;
                        eVar.a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                        eVar.a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                        eVar.a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                    } else {
                        z11 = false;
                        eVar.a("ignore_video", 1);
                        eVar.a("ignore_template", 1);
                        eVar.a("ignore_ec", 1);
                    }
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    } else {
                        eVar.a("n_lrid", campaignEx.getNLRid());
                        if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                            eVar.a("n_rid", campaignEx.getNRid());
                        }
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    }
                    eVar.a(ImpressionLog.f43648x, campaignEx.getRequestId());
                    if (campaignEx.getMof_tplid() != 0) {
                        eVar.a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (eVar.a(CampaignEx.KEY_LOCAL_CHECK_STATE)) {
                        eVar.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar.b(CampaignEx.KEY_LOCAL_CHECK_STATE) + StringUtils.COMMA + campaignEx.getLocalCheckShow());
                    } else {
                        eVar.a(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                    }
                    if (rewardTemplateMode != null && rewardTemplateMode.k() != 0) {
                        if (eVar.a("vtid")) {
                            eVar.a("vtid", eVar.b("vtid") + StringUtils.COMMA + rewardTemplateMode.k());
                        } else {
                            eVar.a("vtid", Integer.valueOf(rewardTemplateMode.k()));
                        }
                    }
                    if (campaignEx.getCreativeId() != 0) {
                        if (eVar.a("crid")) {
                            eVar.a("crid", eVar.b("crid") + StringUtils.COMMA + campaignEx.getCreativeId());
                        } else {
                            eVar.a("crid", Long.valueOf(campaignEx.getCreativeId()));
                        }
                    }
                    if (campaignEx.getVidCrtvId() != 0) {
                        if (eVar.a("video_crid")) {
                            eVar.a("video_crid", eVar.b("video_crid") + StringUtils.COMMA + campaignEx.getVidCrtvId());
                        } else {
                            eVar.a("video_crid", Long.valueOf(campaignEx.getVidCrtvId()));
                        }
                    }
                    if (campaignEx.getEcCrtvId() != 0) {
                        if (eVar.a("endcard_crid")) {
                            eVar.a("endcard_crid", eVar.b("endcard_crid") + StringUtils.COMMA + campaignEx.getEcCrtvId());
                        } else {
                            eVar.a("endcard_crid", Long.valueOf(campaignEx.getEcCrtvId()));
                        }
                    }
                    if (campaignEx.getEcTemplateId() != 0) {
                        if (eVar.a(str9)) {
                            eVar.a(str9, eVar.b(str9) + StringUtils.COMMA + campaignEx.getEcTemplateId());
                        } else {
                            eVar.a(str9, Long.valueOf(campaignEx.getEcTemplateId()));
                        }
                    }
                    eVar.a("bid_tk", campaignEx.getBidToken());
                    if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                        if (v0.i(campaignEx.getMof_template_url())) {
                            eVar.a("sdyv", obj);
                        } else {
                            eVar.a("sdyv", "2");
                        }
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        str3 = str9;
                    } else if (!v0.i(campaignEx.getRewardTemplateMode().j())) {
                        str3 = str9;
                        if (eVar.a("vdyv")) {
                            eVar.a("vdyv", eVar.b("vdyv") + ",2");
                        } else {
                            eVar.a("vdyv", "2");
                        }
                    } else if (eVar.a("vdyv")) {
                        StringBuilder sb2 = new StringBuilder();
                        str3 = str9;
                        sb2.append(eVar.b("vdyv"));
                        sb2.append(",1");
                        eVar.a("vdyv", sb2.toString());
                    } else {
                        str3 = str9;
                        eVar.a("vdyv", obj);
                    }
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        if (v0.i(campaignEx.getendcard_url())) {
                            if (eVar.a("edyv")) {
                                eVar.a("edyv", eVar.b("edyv") + ",1");
                            } else {
                                eVar.a("edyv", obj);
                            }
                        } else if (eVar.a("edyv")) {
                            eVar.a("edyv", eVar.b("edyv") + ",2");
                        } else {
                            eVar.a("edyv", "2");
                        }
                    }
                    if (TextUtils.isEmpty(campaignEx.getExt_data())) {
                        str8 = str8;
                    } else {
                        JSONObject jSONObject = new JSONObject(campaignEx.getExt_data());
                        if (eVar.a(str8)) {
                            str8 = str8;
                            eVar.a(str8, eVar.b(str8) + StringUtils.COMMA + jSONObject.optString("par_dspid"));
                        } else {
                            str8 = str8;
                            eVar.a(str8, jSONObject.optString("par_dspid"));
                        }
                    }
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        if (eVar.a("only_ec")) {
                            eVar.a("only_ec", eVar.b("only_ec") + ",2");
                        } else {
                            eVar.a("only_ec", "2");
                        }
                    } else if (eVar.a("only_ec")) {
                        eVar.a("only_ec", eVar.b("only_ec") + ",1");
                    } else {
                        eVar.a("only_ec", obj);
                    }
                    eVar.a(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? obj : "0");
                    eVar.a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                    String str12 = str7;
                    if (eVar.a(str12)) {
                        eVar.a(str12, eVar.b(str12) + StringUtils.COMMA + campaignEx.getId());
                    } else {
                        eVar.a(str12, campaignEx.getId());
                    }
                    String str13 = str2;
                    if (eVar.a(str13)) {
                        eVar.a(str13, eVar.b(str13) + StringUtils.COMMA + campaignEx.getRequestIdNotice());
                    } else {
                        eVar.a(str13, campaignEx.getRequestIdNotice());
                    }
                    HashMap<String, String> map = com.mbridge.msdk.foundation.controller.a.f34556r;
                    if (map != null) {
                        String str14 = map.get(campaignEx.getCampaignUnitId());
                        if (!TextUtils.isEmpty(str14)) {
                            eVar.a("u_stid", str14);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                        eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                    }
                    if (campaignEx.getAdType() != 0) {
                        eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                    }
                    eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                    eVar.a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                    Object obj2 = obj;
                    if ("2000047".contains(str)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type_d", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason_d", campaignEx.getReasond());
                        }
                    }
                    if ("2000048".contains(str)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason", campaignEx.getReasond());
                        }
                        eVar.a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                    }
                    if (campaignEx.getAdType() == 94 || campaignEx.getAdType() == 287) {
                        if (Arrays.asList(b.f35152j).contains(str)) {
                            eVar.a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                            eVar.a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                            if (Arrays.asList(b.f35154l).contains(str)) {
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.f35139e : a.f35140f));
                            }
                            if (str.equals("2000147")) {
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.f35139e : a.f35140f));
                            }
                        }
                        if (TextUtils.equals(str, "2000130")) {
                            String strJ = campaignEx.getRewardTemplateMode() != null ? campaignEx.getRewardTemplateMode().j() : "";
                            str4 = str12;
                            String str15 = campaignEx.getendcard_url();
                            str5 = str13;
                            eVar.a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str15) || !str15.contains("alecfc=1")) ? a.f35142h : a.f35141g));
                            eVar.a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(strJ) || !strJ.contains("alecfc=1")) ? a.f35142h : a.f35141g));
                            boolean z12 = campaignEx.getPlayable_ads_without_video() == 2 ? true : z11;
                            str6 = str8;
                            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), cVar.B());
                            eVar.a("video_skip_result", Integer.valueOf(cVarC == null ? 2 : cVarC.E()));
                            if (z12) {
                                eVar.a(CampaignEx.VIDEO_END_TYPE, 2);
                            } else {
                                eVar.a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                            }
                        } else {
                            str4 = str12;
                            str5 = str13;
                            str6 = str8;
                        }
                        if (Arrays.asList(b.f35153k).contains(str)) {
                            int clickTempSource = campaignEx.getClickTempSource();
                            if (clickTempSource == 1) {
                                if (campaignEx.getRewardTemplateMode().j().contains("alecfc=1")) {
                                    eVar.a("full_screen_click", Integer.valueOf(a.f35141g));
                                } else {
                                    eVar.a("full_screen_click", Integer.valueOf(a.f35142h));
                                }
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.f35139e : a.f35140f));
                            } else if (clickTempSource == 2) {
                                String str16 = campaignEx.getendcard_url();
                                if (campaignEx.getMof_tplid() != 501 || TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                                    zContains = !TextUtils.isEmpty(str16) ? str16.contains("alecfc=1") : z11;
                                } else {
                                    zContains = campaignEx.getMof_template_url().contains("alecfc=1");
                                }
                                if (zContains) {
                                    eVar.a("full_screen_click", Integer.valueOf(a.f35141g));
                                } else {
                                    eVar.a("full_screen_click", Integer.valueOf(a.f35142h));
                                }
                                eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.f35139e : a.f35140f));
                            }
                            eVar.a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                            eVar.a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                            eVar.a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                        }
                        obj = obj2;
                        str7 = str4;
                        it = it;
                        str9 = str3;
                        str2 = str5;
                        str8 = str6;
                    } else {
                        str2 = str13;
                        obj = obj2;
                        str9 = str3;
                        str7 = str12;
                        it = it;
                    }
                }
            }
            return eVar.a();
        } catch (Exception e12) {
            e = e12;
        }
        exc = e;
        if (MBridgeConstans.DEBUG) {
            exc.printStackTrace();
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> mapE;
        HashMap map = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> mapC = c(str, cVar);
            if (mapC != null) {
                map.putAll(mapC);
            }
            Map<String, String> mapA = a(str, cVar.B(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            if (Arrays.asList(b.f35146d).contains(str) && (mapE = e(str, cVar)) != null) {
                map.putAll(mapE);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            if (!map.containsKey("lrid") || TextUtils.isEmpty(map.get("lrid"))) {
                map.put("lrid", cVar.t());
            }
            if (map.containsKey("lrid")) {
                String str2 = map.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    map.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (map.containsKey("n_lrid")) {
                String str3 = map.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    map.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.f35144b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.f35155m).contains(str)) {
                    map.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    map.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e eVarA = a(str, map);
                if (mVar != null && eVarA != null) {
                    mVar.d(eVarA);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            cVar.j(str);
            Map<String, String> mapA = a(str, cVar.B(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            Map<String, String> mapD = d(str, cVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            com.mbridge.msdk.tracker.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.d(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap map = new HashMap();
        if (cVar == null) {
            return map;
        }
        return cVar.a(cVar.t() + str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolA = com.mbridge.msdk.foundation.same.b.b().a();
            if (boolA != null) {
                jSONObject.put("r_v_r", boolA.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            if (!TextUtils.isEmpty(gVarD.l0())) {
                eVar.a("as_rid", gVarD.l0());
            }
            String strJ = gVarD.J();
            JSONArray jSONArrayI = gVarD.I();
            if (jSONArrayI != null) {
                for (int i10 = 0; i10 < jSONArrayI.length(); i10++) {
                    if (str.equals(jSONArrayI.getString(i10))) {
                        strJ = NastAdapter.ADAPTER_SDK_VERSION_NAME;
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("log_rate", strJ);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                l lVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (lVarD != null && !TextUtils.isEmpty(lVarD.I())) {
                    eVar.a("us_rid", lVarD.I());
                }
                if (lVarD != null && !TextUtils.isEmpty(lVarD.a())) {
                    eVar.a("u_stid", lVarD.a());
                }
                e eVarC = d.b().c(str2);
                if (eVarC != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", eVarC.b("r_stid"));
                            eVarC.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(eVarC);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    private List<CampaignEx> a(c cVar, String str) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.t() + str;
                Map<String, Map<String, String>> mapW = cVar.w();
                int i10 = -1;
                if (mapW != null && mapW.containsKey(str2)) {
                    try {
                        Object obj = mapW.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            iIntValue = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        }
                        i10 = iIntValue;
                    } catch (NumberFormatException e10) {
                        if (MBridgeConstans.DEBUG) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (i10 == 1) {
                    List<CampaignEx> listO = cVar.o() != null ? cVar.o() : cVar.m();
                    if (listO != null && listO.size() > 0) {
                        arrayList.addAll(listO);
                    }
                } else if (cVar.n() != null) {
                    arrayList.add(cVar.n());
                } else {
                    List<CampaignEx> listO2 = cVar.o() != null ? cVar.o() : cVar.m();
                    if (listO2 != null && listO2.size() > 0) {
                        arrayList.addAll(listO2);
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(b.f35147e).contains(str)) {
                map.put("auto_load", cVar != null ? cVar.j() : "");
            }
            if (cVar != null) {
                Map<String, Map<String, String>> mapW = cVar.w();
                String str2 = cVar.t() + str;
                if (mapW.containsKey(str2) && mapW.get(str2) != null) {
                    map.putAll(mapW.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapV = cVar.v();
                    String str3 = cVar.t() + "_" + cVar.q() + "_" + str;
                    if (mapV.containsKey(str3) && mapV.get(str3) != null) {
                        map.putAll(mapV.get(str3));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
        return map;
    }
}
