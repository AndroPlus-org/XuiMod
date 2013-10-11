package com.zst.xposed.xuimod.mods;
/*Animations XML grabbed from Xylon ROMs : http://xylon.androidvenue.com/downloads-2/
 **Inspired by the discontinued mod : http://forum.xda-developers.com/showthread.php?t=2012179 
 ***Xylon Animation Relacement
 */
import com.zst.xposed.xuimod.R;
import com.zst.xposed.xuimod.XuiMod;

import android.content.res.XModuleResources;
import android.content.res.XResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;

public class XylonAnimMod {
	public static void handleInitPackageResources(InitPackageResourcesParam resparam){
		if (!resparam.packageName.equals("android"))return;
		XModuleResources modRes = XModuleResources.createInstance(XuiMod.MODULE_PATH, resparam.res);
		XResources.setSystemWideReplacement("android", "anim", "window_move_from_decor", modRes.fwd(R.anim.window_move_from_decor));
		XResources.setSystemWideReplacement("android", "anim", "options_panel_enter", modRes.fwd(R.anim.options_panel_enter));
		XResources.setSystemWideReplacement("android", "anim", "options_panel_exit", modRes.fwd(R.anim.options_panel_exit));
		XResources.setSystemWideReplacement("android", "anim", "recent_enter", modRes.fwd(R.anim.recent_enter));
		XResources.setSystemWideReplacement("android", "anim", "recent_exit", modRes.fwd(R.anim.recent_exit));
		XResources.setSystemWideReplacement("android", "anim", "recents_fade_in", modRes.fwd(R.anim.recents_fade_in));
		XResources.setSystemWideReplacement("android", "anim", "recents_fade_out", modRes.fwd(R.anim.recents_fade_out));
		XResources.setSystemWideReplacement("android", "anim", "submenu_enter", modRes.fwd(R.anim.submenu_enter));
		XResources.setSystemWideReplacement("android", "anim", "submenu_exit", modRes.fwd(R.anim.submenu_exit));
		XResources.setSystemWideReplacement("android", "anim", "input_method_enter", modRes.fwd(R.anim.input_method_enter));  
		XResources.setSystemWideReplacement("android", "anim", "input_method_exit", modRes.fwd(R.anim.input_method_exit));
		XResources.setSystemWideReplacement("android", "anim", "input_method_extract_exit", modRes.fwd(R.anim.input_method_extract_exit));
		XResources.setSystemWideReplacement("android", "anim", "input_method_extract_enter", modRes.fwd(R.anim.input_method_extract_enter));
		XResources.setSystemWideReplacement("android", "anim", "input_method_fancy_enter", modRes.fwd(R.anim.input_method_fancy_enter));
		XResources.setSystemWideReplacement("android", "anim", "input_method_fancy_exit", modRes.fwd(R.anim.input_method_fancy_exit));
		XResources.setSystemWideReplacement("android", "anim", "app_starting_exit", modRes.fwd(R.anim.app_starting_exit));
		XResources.setSystemWideReplacement("android", "anim", "activity_close_enter", modRes.fwd(R.anim.activity_close_enter));
		XResources.setSystemWideReplacement("android", "anim", "activity_close_exit", modRes.fwd(R.anim.activity_close_exit));
		XResources.setSystemWideReplacement("android", "anim", "activity_open_enter", modRes.fwd(R.anim.activity_open_enter));
		XResources.setSystemWideReplacement("android", "anim", "activity_open_exit", modRes.fwd(R.anim.activity_open_exit));
		XResources.setSystemWideReplacement("android", "anim", "dialog_enter", modRes.fwd(R.anim.dialog_enter));
		XResources.setSystemWideReplacement("android", "anim", "dialog_exit", modRes.fwd(R.anim.dialog_exit));
		XResources.setSystemWideReplacement("android", "anim", "toast_exit", modRes.fwd(R.anim.toast_exit)); 
		XResources.setSystemWideReplacement("android", "anim", "toast_enter", modRes.fwd(R.anim.toast_enter));
		XResources.setSystemWideReplacement("android", "anim", "lock_screen_exit", modRes.fwd(R.anim.lock_screen_exit));
		XResources.setSystemWideReplacement("android", "anim", "task_close_enter", modRes.fwd(R.anim.task_close_enter));
		XResources.setSystemWideReplacement("android", "anim", "task_close_exit", modRes.fwd(R.anim.task_close_exit));
		XResources.setSystemWideReplacement("android", "anim", "task_open_enter", modRes.fwd(R.anim.task_open_enter));
		XResources.setSystemWideReplacement("android", "anim", "task_open_exit", modRes.fwd(R.anim.task_open_exit));
	}
}
