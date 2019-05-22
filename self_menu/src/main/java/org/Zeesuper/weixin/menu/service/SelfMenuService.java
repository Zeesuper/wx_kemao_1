package org.Zeesuper.weixin.menu.service;

import org.Zeesuper.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu getMenu();

	void saveMenu(SelfMenu selfMenu);

}
