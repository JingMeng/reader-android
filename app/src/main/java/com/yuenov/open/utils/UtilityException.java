package com.yuenov.open.utils;


/**
 * Created niupuyue
 * Date 2019/1/10
 * DES 鍏ㄥ眬寮傚父鎹曡幏鎺у埗绫伙紝灏嗛敊璇俊鎭褰? */
public class UtilityException {

    /**
     * @param obj 褰撳墠椤甸潰鐨勫璞?     * @param e
     */
    public static void catchException(Object obj, Exception e) {

//        if (e == null)
//            return;
//
//        e.printStackTrace();
//        CrashReport.postCatchedException(e);
//
//        String classInfo;
//
//        try {
//            if (obj == null) {
//                classInfo = "type is null";
//            }
//            // activity
//            else if (obj instanceof String) {
//                classInfo = obj.toString();
//            }
//            // activity
//            else if (obj instanceof Activity) {
//                classInfo = ((Activity) obj).getLocalClassName();
//            }
//            // FragmentActivity
//            else if (obj instanceof FragmentActivity) {
//                classInfo = ((FragmentActivity) obj).getLocalClassName();
//            }
//            // android.app.Fragment
//            else if (obj instanceof android.app.Fragment) {
//                android.app.Fragment fragment = ((android.app.Fragment) obj);
//                if (fragment.getActivity() != null) {
//                    classInfo = fragment.getActivity().getLocalClassName();
//                } else {
//                    classInfo = "";
//                }
//            }
//            // androidx.fragment.app.Fragment
//            else if (obj instanceof androidx.fragment.app.Fragment) {
//                androidx.fragment.app.Fragment fragment = ((androidx.fragment.app.Fragment) obj);
//                if (fragment.getActivity() != null) {
//                    classInfo = fragment.getActivity().getLocalClassName();
//                } else {
//                    classInfo = "";
//                }
//            } else {
//                classInfo = "type is : "+ obj.getClass().getName();
//            }
//
//            classInfo += "\n\n";
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            classInfo="";
//        }

//        // debug锛屽脊鍑哄睍绀哄睍绀篍xception淇℃伅鐨勯〉闈?//        if (AppConstant.isDebug) {
//            try {
//                Intent intent = DebugExceptionActivity.getIntent(RRApplication.getAppContext(), classInfo, e);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                RRApplication.getAppContext().startActivity(intent);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                CrashReport.postCatchedException(ex);
//            }
//        }
    }

    public static void catchException(Exception e) {
        catchException("", e);
    }
}
