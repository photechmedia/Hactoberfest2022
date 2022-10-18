
#include<bits/stdc++.h>
using namespace std;
struct node
{
	int data;
	struct node* left;
	struct node* right;
};

void printGivenLevel(struct node* root,
					int level, int ltr);
int height(struct node* node);
struct node* newNode(int data);
void printSpiral(struct node* root)
{
	int h = height(root);
	int i;
	bool ltr = false;
	for(i = 1; i <= h; i++)
	{
		printGivenLevel(root, i, ltr);
		ltr = !ltr;
	}
}
void printGivenLevel(struct node* root,
					int level, int ltr)
{
	if (root == NULL)
		return;
	if (level == 1)
		cout << root->data << " ";
		
	else if (level > 1)
	{
		if (ltr)
		{
			printGivenLevel(root->left,
							level - 1, ltr);
			printGivenLevel(root->right,
							level - 1, ltr);
		}
		else
		{
			printGivenLevel(root->right,
							level - 1, ltr);
			printGivenLevel(root->left,
							level - 1, ltr);
		}
	}
}
int height(struct node* node)
{
	if (node == NULL)
		return 0;
	else
	{
		int lheight = height(node->left);
		int rheight = height(node->right);
		if (lheight > rheight)
			return (lheight + 1);
		else
			return (rheight + 1);
	}
}
struct node* newNode(int data)
{
	node* newnode = new node();
	newnode->data = data;
	newnode->left = NULL;
	newnode->right = NULL;

	return (newnode);
}

int main()
{
	struct node* root = newNode(1);
	root->left = newNode(2);
	root->right = newNode(3);
	root->left->left = newNode(7);
	root->left->right = newNode(6);
	root->right->left = newNode(5);
	root->right->right = newNode(4);
	printf("Spiral Order traversal of "
		"binary tree is \n");
			
	printSpiral(root);

	return 0;
}

