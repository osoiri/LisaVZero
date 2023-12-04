# LisaVZero
Version 0 of Lisa is a fully functioning CLI interface for 1 user for **task manager** with a basic progression system.

NOTE: [java.time](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html) package and its classes - [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html), [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) will be used for all date and time related requirements.

Primary features of the CLI version ---

- Supports 1 user creation
- 1 user can create, remove, modify profiles
- Each profile will have task
- Each task has rewards associated
- When tasks are completed, the corresponding reward gets added to the user and profile
- Option to update task start and end time which will be checked if filled during task completion to determine new multiplier
