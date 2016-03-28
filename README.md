# TNote
Source Code of application TNote.

[View app in Play market.](https://play.google.com/store/apps/details?id=bubal.tnote&hl)

This is a task manager app with instant search and notifications.

<b>Features:</b>
- Create and modify tasks with notifications and set them at certain time/day;
- Tasks are diveded to few categories: no date, overdue, today, tomorrow, next 7 days, future;
- Modify tasks by pressing on them, delete - with long pressing;
- Set priority for your tasks;
- Mark tasks as current/completed;
- You can also create tasks without notification and any specific time/day;
- Instant search among current/completed tasks;
- Avaliable in languages: English, Russian, Czech;
- Compatible with Android 4.0 and higher;


<b>Realisation:</b>
- Tasks are created and stored in SQLite database. Modifying and sorting made with SQLite queries. Database is updatebale through version changing.
- App has only one activity, all actions (like adding task, editing, removing, etc.) are made with Fragments.
- Implemented ads module: it won't hurt user expirience, all components dynamically changes their size to avoid intersection with ads;
- Main activity have ToolBar with 2 tabs - current tasks and completed.
- Notifications are implemented with help of Alarm Manager, Broadcast Reciever and Notification Manager.
- There is a small preference for hiding the splaschscreen. Implemented with help of Shared Preferences.
- App requires permition to launch itself after devise boot. It's  needed for setting up notifications without launching the app itself.
- Permitions for internet acces and network status are needed for ads module.


<b>Screenshots:</b>

<img src="https://cloud.githubusercontent.com/assets/17985872/13971800/83640d72-f093-11e5-9e43-53bfa8347562.png" width="288" height="480" />
<img src="https://cloud.githubusercontent.com/assets/17985872/13971799/836062ee-f093-11e5-8076-03a1eb03eaec.png" width="288" height="480" />
<img src="https://cloud.githubusercontent.com/assets/17985872/13971798/8360164a-f093-11e5-8021-ac6f7b5d027b.png" width="288" height="480" />
