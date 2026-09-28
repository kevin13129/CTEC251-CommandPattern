# Journal
The Command object handles its own undo logic, so EditorApp does not need to know how to reverse every action. EditorApp only calls undo on the last command, which keeps it simpler.