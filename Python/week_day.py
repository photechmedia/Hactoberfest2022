class Result:
    def findDay(self, day, month, year):
        wd=""   #week-day
        d=6
        y=year
        d+= (y*365)+(y//4)-(y//100)+(y//400)
        if month == 12:
            d+= 30
        if month >= 11:
            d+= 31
        if month >= 10:
            d+= 30
        if month >= 9:
            d+= 31
        if month >= 8:
            d+= 31
        if month >= 7:
            d+= 30
        if month >= 6:
            d+= 31
        if month >= 5:
            d+= 30
        if month >= 4:
            d+= 31
        if month >= 3:
            if(year%400==0):
                d+= 29
            elif(year%100==0):
                d+= 28
            elif(year%4==0):
                d+= 29
            else:
                d+= 28
        if month >= 2:
            d+= 31
        if month >= 1:
            if(year%400==0):
                d-= 1
            elif(year%100==0):
                d = d
            elif(year%4==0):
                d-= 1

        d+= day
        d%= 7
        if d == 0:
            wd="SUNDAY"
        if d == 1:
            wd="MONDAY"
        if d == 2:
            wd="TUESDAY"
        if d == 3:
            wd="WEDNESDAY"
        if d == 4:
            wd="THURSDAY"
        if d == 5:
            wd="FRIDAY"
        if d == 6:
            wd="SATURDAY"
        return wd
 

print('Enter Date of Birth')
day, month, year = [int(i) for i in input().split()]        
ob = Result()
res = ob.findDay(day, month, year)
print("\nWeek Day->  ", res)