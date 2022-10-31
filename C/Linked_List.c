#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
typedef struct node NODE;

NODE* create(NODE* start)
{
    NODE *prevnode=NULL , *newnode;
    int check=1 ;
    while (check!=0)
    {
        newnode=(NODE*)malloc(sizeof(NODE));
        printf("enter data ");
        scanf("%d",&newnode->data);
        if(start==NULL)
        {
            start = newnode;
        }
        else
        prevnode->next=newnode;
        prevnode=newnode;
        newnode->next=NULL;
        printf("enter 0 to exit ");
        scanf("%d",&check);
        
    }
    return start;
    
}

void display(NODE *start)
{
    while (start->next!=NULL)
    {
        printf("%d\n",start->data);
        start=start->next;
    }
     printf("%d\n",start->data);

    
}

int main()
{
    NODE *start=NULL;
    start=create(start);
    display(start);
}
