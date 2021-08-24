
def Table(iNo):

    if(iNo < 0):
        iNo = -iNo
    
    i = 1

    while i <= 10:
        print(i*iNo,end=" ")
        i += 1

    print()
    
 
def main():
    iValue = int(input("Enter Number\n"))

    Table(iValue)


if __name__ == "__main__":

    main()