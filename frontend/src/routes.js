/*!

=========================================================
* Now UI Dashboard React - v1.4.0
=========================================================

* Product Page: https://www.creative-tim.com/product/now-ui-dashboard-react
* Copyright 2020 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/now-ui-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import Dashboard from "views/Dashboard.js";
import Notifications from "views/Notifications.js";
import Icons from "views/Icons.js";
import Typography from "views/Typography.js";
import TableList from "views/TableList.js";
import Maps from "views/Maps.js";
import Upgrade from "views/Upgrade.js";
import UserPage from "views/UserPage.js";
import GroupPage from "views/CreateGroupPage.js"

var dashRoutes = [
  {
    path: "/dashboard",
    name: "뉴스피드",
    icon: "design_app",
    component: Dashboard,
    layout: "/admin",
  },
  {
    path: "/icons",
    name: "테스트1",
    icon: "design_image",
    component: Icons,
    layout: "/admin",
  },
  {
    path: "/maps",
    name: "테스트2",
    icon: "location_map-big",
    component: Maps,
    layout: "/admin",
  },
  {
    path: "/notifications",
    name: "테스트3",
    icon: "ui-1_bell-53",
    component: Notifications,
    layout: "/admin",
  },
  {
    path: "/user-page",
    name: "테스트4",
    icon: "users_single-02",
    component: UserPage,
    layout: "/admin",
  },
  {
    path: "/extended-tables",
    name: "테스트5",
    icon: "files_paper",
    component: TableList,
    layout: "/admin",
  },
  {
    path: "/typography",
    name: "테스트6",
    icon: "design-2_ruler-pencil",
    component: Typography,
    layout: "/admin",
  },
  {
    path: "/createGroup",
    name: "그룹생성",
    icon: "design-2_ruler-pencil",
    component: GroupPage,
    layout: "/admin",
    children:[
      {
        name:"테스트1",
        icon: "design-2_ruler-pencil"
      },{
        name:"테스트2",
        icon: "design-2_ruler-pencil"
      }
    ]
  }
];
export default dashRoutes;
