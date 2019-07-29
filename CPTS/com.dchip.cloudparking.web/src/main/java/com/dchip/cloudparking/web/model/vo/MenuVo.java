package com.dchip.cloudparking.web.model.vo;

import java.util.List;

public class MenuVo {
		private Integer id;
		//菜单名
		private String name;
		//连接地址
		private String href;
		//样式
		private String iconcss;
		//子菜单
		private List<SubMenuVo> children;
		//英文名字
		private String menuCss;
		
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getHref() {
			return href;
		}
		public void setHref(String href) {
			this.href = href;
		}
		public String getIconcss() {
			return iconcss;
		}
		public void setIconcss(String iconcss) {
			this.iconcss = iconcss;
		}
		public List<SubMenuVo> getChildren() {
			return children;
		}
		public void setChildren(List<SubMenuVo> children) {
			this.children = children;
		}
		public String getMenuCss() {
			return menuCss;
		}
		public void setMenuCss(String menuCss) {
			this.menuCss = menuCss;
		}
		
}