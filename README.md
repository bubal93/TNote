# TNote
Source Code of application TNote.

This is a task manager app with instant search and notifications.

<b>Features:</b>
- Create and modify tasks with notifications and set them at certain time/day;
- Tasks are diveded to few categories: no date, overdue, today, tomorrow, next 7 days, future;
- Modify tasks by pressing on them, delete - with long pressing;
- Set priority for your tasks;
- Mark tasks as current/completed;
- You can also create tasks without notification and any specific time/day;
- Instant search among current/completed tasks;
- Avaliable in languages: English, Russian;
- Compatible with Android 4.0 and higher;


<b>Realisation:</b>
- Tasks are created and stored in SQLite database. Modifying and sorting made with SQLite queries. Database is updatebale through version changing.
- App has only one activity, all actions (like adding task, editing, removing, etc.) are made with Fragments.
- Main activity have ToolBar with 2 tabs - current tasks and completed.
- Notifications are implemented with help of Alarm Manager, Broadcast Reciever and Notification Manager.
- There is a small preference for hiding the splaschscreen. Implemented with help of Shared Preferences.
- App requires permition to launch itself after devise boot. It's  needed for setting up notifications without launching the app itself.
