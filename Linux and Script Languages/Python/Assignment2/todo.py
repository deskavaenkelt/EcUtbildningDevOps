class ToDo:
    def __init__(self, description, time_created, time_done=0, time_updated=0):
        self.description = description
        self.time_created = time_created
        self.time_done = time_done
        self.time_updated = time_updated

    def print_description(self):
        print(self.description)
